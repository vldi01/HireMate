package com.tarlad.eventsmap.shared

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

fun EventsViewModel.observeEvents(callback: (List<Event>)->Unit) {
    viewModelScope.launch {
        withContext(Dispatchers.Main) {
            events.collect{
                callback(it)
            }
        }
    }
}