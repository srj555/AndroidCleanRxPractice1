package com.srdroid.practice1.di

import com.srdroid.practice1.data.remote.MemeApi
import com.srdroid.practice1.data.repository.MemeRepositoryImpl
import com.srdroid.practice1.domain.repository.MemeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideMemeRepository(memeApi: MemeApi): MemeRepository {
        return MemeRepositoryImpl(memeApi)
    }
}