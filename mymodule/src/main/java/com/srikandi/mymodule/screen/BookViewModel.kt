package com.srikandi.mymodule.screen

import com.airbnb.mvrx.FragmentViewModelContext
import com.airbnb.mvrx.MvRxViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import com.srikandi.core.MvRxViewModel

class BookViewModel @AssistedInject constructor(
    @Assisted initialState: BookState
) : MvRxViewModel<BookState>(initialState) {

    @AssistedInject.Factory
    interface Factory {
        fun create(initialState: BookState): BookViewModel
    }

    companion object : MvRxViewModelFactory<BookViewModel, BookState> {
        @JvmStatic
        override fun create(viewModelContext: ViewModelContext, state: BookState): BookViewModel? {
            val fragment = (viewModelContext as FragmentViewModelContext).fragment<BookFragment>()
            return fragment.viewModelFactory.create(state)
        }
    }
}