package com.tarlad.eventsmap.shared.pagination

data class Pagination(
    val page: Int,
    val pageCount: Int,
    val pageSize: Int,
    val total: Int
)