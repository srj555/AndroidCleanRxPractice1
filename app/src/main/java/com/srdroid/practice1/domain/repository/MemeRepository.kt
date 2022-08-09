package com.srdroid.practice1.domain.repository

import com.srdroid.practice1.data.model.MemeDTO
import io.reactivex.rxjava3.core.Observable

interface MemeRepository {
    fun getMeme(): Observable<MemeDTO>
}