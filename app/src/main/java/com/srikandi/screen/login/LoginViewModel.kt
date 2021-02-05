package com.srikandi.screen.login

import com.airbnb.mvrx.FragmentViewModelContext
import com.airbnb.mvrx.MvRxViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import com.srikandi.core.MvRxViewModel

class LoginViewModel @AssistedInject constructor(
    @Assisted initialState: LoginState
) : MvRxViewModel<LoginState>(initialState) {

    @AssistedInject.Factory
    interface Factory {
        fun create(initialState: LoginState): LoginViewModel
    }

    companion object : MvRxViewModelFactory<LoginViewModel, LoginState> {
        @JvmStatic
        override fun create(viewModelContext: ViewModelContext, state: LoginState): LoginViewModel? {
            val fragment = (viewModelContext as FragmentViewModelContext).fragment<LoginFragment>()
            return fragment.viewModelFactory.create(state)
        }
    }
}