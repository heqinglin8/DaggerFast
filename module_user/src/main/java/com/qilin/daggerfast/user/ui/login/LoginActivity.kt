package com.qilin.daggerfast.user.ui.login

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.qilin.core.utils.CommDaggerUtil
import com.qilin.daggerfast.user.R
import com.qilin.daggerfast.user.component.DaggerLoginComponent
import com.qilin.daggerfast.user.component.LoginComponent
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    lateinit var loginComponent: LoginComponent
    @Inject
    lateinit var loginViewModel: LoginViewModel
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: LoginPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
//        appComponent = (applicationContext as MyApplication).appComponent


        // Creates a new instance of LoginComponent
        // Injects the component to populate the @Inject fields
        loginComponent = DaggerLoginComponent.factory().create(CommDaggerUtil.appComponent)
        loginComponent.inject(this)
        super.onCreate(savedInstanceState)
        Log.d("LoginActivity", "onCreate, loginViewModel: $loginViewModel")
        setContentView(R.layout.activity_login) // 创建对应的布局文件

        tabLayout = findViewById(R.id.tab_layout_login)
        viewPager = findViewById(R.id.view_pager_login)

        pagerAdapter = LoginPagerAdapter(this)
        viewPager.adapter = pagerAdapter

        // 将 TabLayout 和 ViewPager2 关联起来
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = pagerAdapter.getPageTitle(position)
        }.attach()
    }
}

/**
 * Extension function to simplify setting an afterTextChanged action to EditText components.
 */
fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    })
}
