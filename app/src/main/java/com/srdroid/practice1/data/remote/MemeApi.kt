package com.srdroid.practice1.data.remote

import com.srdroid.practice1.data.model.MemeDTO
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface MemeApi {
    @GET("get_memes")
    fun getMeme(): Observable<MemeDTO>
}