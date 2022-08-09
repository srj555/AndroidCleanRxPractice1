package com.srdroid.practice1.domain.usecases

import com.srdroid.practice1.data.model.MemeDTO
import com.srdroid.practice1.domain.repository.MemeRepository
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class GetMemeDataUseCase @Inject constructor(private val memeRepository: MemeRepository) {
    operator fun invoke(): Observable<MemeDTO> {
        return memeRepository.getMeme()
    }
}