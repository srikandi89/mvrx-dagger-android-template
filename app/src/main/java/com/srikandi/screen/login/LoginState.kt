package com.srikandi.screen.login

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.MvRxState
import com.airbnb.mvrx.Uninitialized
import com.srikandi.data.dto.LoginDetailDto

data class LoginState(
    val loginDetailAsync: Async<LoginDetailDto> = Uninitialized,
    val isAuthenticated: Boolean = false
) : MvRxState