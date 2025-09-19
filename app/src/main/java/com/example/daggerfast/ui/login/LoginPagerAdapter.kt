package com.example.daggerfast.ui.login

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class LoginPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val fragments = listOf(
        LoginUsernameFragment.newInstance(),
        LoginPhoneFragment.newInstance()
    )

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]

    fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "用户登录" // Tab 1 的标题
            1 -> "手机登录"   // Tab 2 的标题
            else -> ""
        }
    }
}