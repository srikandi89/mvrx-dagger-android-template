package com.srikandi.mymodule.screen

import android.os.Bundle
import com.airbnb.mvrx.*
import com.srikandi.core.BaseAppFragment
import com.srikandi.mymodule.R
import com.srikandi.mymodule.data.dto.BookDto
import javax.inject.Inject

class BookFragment : BaseAppFragment(R.layout.fragment_book) {
    @Inject
    lateinit var viewModelFactory: BookViewModel.Factory

    private val viewModel: BookViewModel by fragmentViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        subscribeBookState()
    }

    override fun invalidate() { }

    private fun subscribeBookState() {
        viewModel.selectSubscribe(BookState::bookAsync, uniqueOnly()) { bookState ->
            handleBookState(bookState)
        }
    }

    private fun handleBookState(bookAsync: Async<BookDto>) {
        when(bookAsync) {
            is Uninitialized -> {}
            is Loading -> {}
            is Fail -> {}
            is Success -> {}
        }
    }

}