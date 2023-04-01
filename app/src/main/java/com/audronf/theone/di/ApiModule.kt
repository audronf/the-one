package com.audronf.theone.di

import com.audronf.theone.data.remote.BooksService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {

    @Provides
    fun provideBooksService(retrofit: Retrofit): BooksService =
        retrofit.create(BooksService::class.java)
}
