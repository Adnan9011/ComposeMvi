package com.project.core.presentation

import androidx.lifecycle.LiveData
import com.project.core.mvi.MviIntent
import com.project.core.mvi.MviState
import io.reactivex.rxjava3.core.Observable

interface MviViewModel<I : MviIntent, S : MviState> {
    fun processIntents(intents: Observable<I>)

    fun states(): LiveData<S>
}