package com.qilin.daggerfast.ui.login

import android.content.ClipData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.qilin.daggerfast.data.LoginDataSource
import com.qilin.daggerfast.data.LoginRepository
import com.qilin.daggerfast.data.LoginService
import com.qilin.daggerfast.data.model.LoggedInUser
import retrofit2.Call

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginRepository = LoginRepository(
                    dataSource = LoginDataSource(),
                    loginService = object :LoginService{
                        override suspend fun login(
                            username: String,
                            uid: String
                        ): Call<LoggedInUser> {
                            TODO("Not yet implemented")
                        }

                        override suspend fun categoryList(
                            category: String,
                            page: Int
                        ): Call<List<ClipData.Item>> {
                            TODO("Not yet implemented")
                        }
                    }
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}