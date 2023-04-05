package com.audronf.theone.networking

import com.audronf.theone.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class AuthorizationInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder()
            .addHeader("Authorization", "Bearer "+ BuildConfig.API_KEY)
            .build()
        return chain.proceed(request)
    }
}
