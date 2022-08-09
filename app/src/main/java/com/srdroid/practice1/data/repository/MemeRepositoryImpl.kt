package com.srdroid.practice1.data.repository

import com.srdroid.practice1.data.model.MemeDTO
import com.srdroid.practice1.data.remote.MemeApi
import com.srdroid.practice1.domain.repository.MemeRepository
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class MemeRepositoryImpl @Inject constructor(private val memeApi: MemeApi) : MemeRepository {
    override fun getMeme(): Observable<MemeDTO> {
        return memeApi.getMeme()
    }
}