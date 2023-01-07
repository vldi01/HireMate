package com.tarlad.eventsmap.shared.consultancy

import io.ktor.client.*

class ConsultancyRepo(private val client: HttpClient) {
    suspend fun getAllConsultancy(): List<Consultancy> {
        return emptyList()
    }
}
