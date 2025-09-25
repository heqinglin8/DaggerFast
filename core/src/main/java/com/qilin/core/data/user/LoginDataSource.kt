package com.qilin.core.data.user

import com.qilin.core.data.user.model.LoggedInUser
import java.io.IOException
import java.util.UUID
import javax.inject.Inject

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource @Inject constructor(){

    fun login(username: String, password: String): com.qilin.core.data.Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(UUID.randomUUID().toString(), "Jane Doe")
            return _root_ide_package_.com.qilin.core.data.Result.Success(fakeUser)
        } catch (e: Throwable) {
            return _root_ide_package_.com.qilin.core.data.Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}