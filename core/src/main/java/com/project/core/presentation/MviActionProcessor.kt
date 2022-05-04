package com.project.core.presentation

import com.project.core.mvi.MviAction
import com.project.core.mvi.MviResult
import io.reactivex.rxjava3.core.FlowableTransformer

interface MviActionProcessor<A : MviAction, R : MviResult> {
    val schedulerProvider: ISchedulerProvider

    fun transformFromAction(): FlowableTransformer<A, R>
}