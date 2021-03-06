package com.marverenic.reader.data

import com.marverenic.reader.BuildConfig

class DevAuthenticationManager: AuthenticationManager {

    override fun isLoggedIn() = true

    override fun getFeedlyAuthToken() = BuildConfig.DEV_OAUTH_TOKEN.takeIf { !it.isNullOrBlank() }
            ?: throw RuntimeException("Invalid dev oauth key")

    override fun getFeedlyUserId() = BuildConfig.DEV_USER_ID.takeIf { !it.isNullOrBlank() }
            ?: throw RuntimeException("Invalid dev username")

}