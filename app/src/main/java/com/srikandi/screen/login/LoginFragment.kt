package com.srikandi.screen.login

import android.os.Bundle
import com.airbnb.mvrx.*
import com.srikandi.R
import com.srikandi.core.BaseAppFragment
import com.srikandi.data.dto.LoginDetailDto
import javax.inject.Inject

class LoginFragment : BaseAppFragment(R.layout.fragment_main) {
    @Inject
    lateinit var viewModelFactory: LoginViewModel.Factory

    private val viewModel: LoginViewModel by fragmentViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        subscribeLoginState()
    }

    override fun invalidate() { }

    private fun subscribeLoginState() {
        viewModel.selectSubscribe(LoginState::loginDetailAsync) { stateAsync ->
            handleLoginState(stateAsync)
        }
    }

    private fun handleLoginState(stateAsync: Async<LoginDetailDto>) {
        when (stateAsync) {
            is Uninitialized -> {
            }
            is Loading -> {
            }
            is Fail -> {
            }
            is Success -> {
            }
        }
    }

}