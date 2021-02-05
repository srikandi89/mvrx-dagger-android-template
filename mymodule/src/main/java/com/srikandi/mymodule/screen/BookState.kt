package com.srikandi.mymodule.screen

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.MvRxState
import com.srikandi.mymodule.data.dto.BookDto

data class BookState(
    val bookAsync: Async<BookDto>
) : MvRxState