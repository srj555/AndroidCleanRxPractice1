package com.srdroid.practice1.di

import com.srdroid.practice1.common.AppConstants
import com.srdroid.practice1.data.remote.MemeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .baseUrl(AppConstants.BASE_URL).build()
    }

    @Provides
    fun provideMemeApi(retrofit: Retrofit): MemeApi {
        return retrofit.create(MemeApi::class.java)
    }

}