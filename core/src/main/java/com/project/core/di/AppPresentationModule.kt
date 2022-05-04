package com.project.core.di

import com.project.core.presentation.ISchedulerProvider
import com.project.core.presentation.SchedulerProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppPresentationModule {

    @Provides
    @Singleton
    fun provideSchedulerProvider(): ISchedulerProvider =
        SchedulerProvider()
}