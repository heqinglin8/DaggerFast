package com.qilin.daggerfast.user.ui.login

import android.content.ClipData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.qilin.daggerfast.user.biz.data.user.LoginDataSource
import com.qilin.daggerfast.user.biz.data.user.LoginRepository
import com.qilin.daggerfast.user.biz.data.user.LoginService
import com.qilin.daggerfast.user.biz.data.user.model.LoggedInUser
import javax.inject.Inject
import javax.inject.Provider

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
//class AuthViewModelFactory @Inject constructor(
//    val factory: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<IViewModel>>
//)
class LoginViewModelFactory @Inject constructor( val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>) : ViewModelProvider.Factory