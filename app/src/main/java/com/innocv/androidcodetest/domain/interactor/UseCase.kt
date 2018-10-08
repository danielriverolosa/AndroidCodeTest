package com.innocv.androidcodetest.domain.interactor

import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch

abstract class UseCase<out T, in Params> {

    fun executeAsync(
            params: Params,
            onSuccess: (T) -> Unit,
            onError: (Throwable) -> Unit
    ) {
        val deferred = async { runInBackground(params) }
        launch(UI) {
            try {
                onSuccess(deferred.await())
            } catch (e: Exception) {
                onError(e)
            }
        }
    }

    protected abstract fun runInBackground(params: Params): T

    class None

}