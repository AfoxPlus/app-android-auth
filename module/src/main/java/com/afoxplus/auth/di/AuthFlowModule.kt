package com.afoxplus.auth.di

import com.afoxplus.auth.delivery.flow.AuthFlow
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object AuthFlowModule {
    @Provides
    fun provideAuthFlow(): AuthFlow = AuthFlow.build()
}