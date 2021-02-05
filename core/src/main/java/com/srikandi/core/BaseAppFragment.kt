package com.srikandi.core

import android.content.Context
import androidx.annotation.LayoutRes
import com.airbnb.mvrx.BaseMvRxFragment
import dagger.android.support.AndroidSupportInjection

abstract class BaseAppFragment(
    @LayoutRes contentLayoutId: Int
) : BaseMvRxFragment(contentLayoutId) {
    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}