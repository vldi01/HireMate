package com.tarlad.eventsmap.shared.consultancy

import com.tarlad.eventsmap.shared.base.BaseViewModel
import io.ktor.client.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(private val client: HttpClient): BaseViewModel() {
    val events = MutableStateFlow(listOf<Event>())

    override fun onStart() {
        viewModelScope.launch {

        }
    }
}