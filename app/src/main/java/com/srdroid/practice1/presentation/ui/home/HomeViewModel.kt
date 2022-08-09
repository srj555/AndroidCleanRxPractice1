package com.srdroid.practice1.presentation.ui.home

import android.util.Log
import androidx.lifecycle.ViewModel
import com.srdroid.practice1.domain.usecases.GetMemeDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getMemeDataUseCase: GetMemeDataUseCase) :
    ViewModel() {

    private val _getMemeState = MutableStateFlow("")

    fun getMeme() {

        getMemeDataUseCase.invoke().subscribe({
            // Success
         Log.d("TAG",it.toString())
        }, {
            // Throwable error
        }
        )
    }

}