package com.innocv.androidcodetest.infrastructure.di.component

import com.innocv.androidcodetest.infrastructure.di.module.ViewModule
import com.innocv.androidcodetest.infrastructure.di.scope.ViewScope
import com.innocv.androidcodetest.presentation.main.MainActivity
import dagger.Subcomponent


@ViewScope
@Subcomponent(
        modules = [
            ViewModule::class
        ]
)
interface ViewComponent {

    fun inject(activity: MainActivity)

}