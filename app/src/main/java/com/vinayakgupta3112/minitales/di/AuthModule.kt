package com.vinayakgupta3112.minitales.di

import com.vinayakgupta3112.minitales.auth.data.AuthRepository
import com.vinayakgupta3112.minitales.auth.data.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject


@InstallIn(ViewModelComponent::class)
@Module
class AuthModule {
    @Provides
    fun provideAuthRepository(impl: AuthRepositoryImpl): AuthRepository = impl
}