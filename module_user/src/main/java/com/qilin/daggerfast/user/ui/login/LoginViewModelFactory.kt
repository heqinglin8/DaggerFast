package com.qilin.daggerfast.user.ui.login

import android.content.ClipData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.qilin.core.data.user.LoginDataSource
import com.qilin.core.data.user.LoginRepository
import com.qilin.core.data.user.LoginService
import com.qilin.core.data.user.model.LoggedInUser

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
                    loginService = object : LoginService {
                        override suspend fun login(
                            username: String,
                            uid: String
                        ): LoggedInUser {
                            TODO("Not yet implemented")
                        }

                        override suspend fun categoryList(
                            category: String,
                            page: Int
                        ): List<ClipData.Item> {
                            TODO("Not yet implemented")
                        }

                    }
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}