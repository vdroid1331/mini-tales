package com.vinayakgupta3112.minitales.di

import com.vinayakgupta3112.minitales.BuildConfig
import com.vinayakgupta3112.minitales.network.MiniTalesHttpClientBuilder
import com.vinayakgupta3112.minitales.network.RequestHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.http.URLProtocol

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideHttpClient(): HttpClient = MiniTalesHttpClientBuilder()
        .protocol(URLProtocol.HTTP)
        .host(BuildConfig.MINI_TALES_HOST)
        .build()

    @Provides
    fun provideRequestHandler(client: HttpClient): RequestHandler = RequestHandler(client)
}