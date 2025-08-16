package com.example.musik_link

import kotlinx.serialization.Serializable

@Serializable
data class Booking(
    val bookingId: String = "",
    val musicianId: String = "",
    val eventTitle: String = "",
    val eventDescription: String = "",
    val eventLocation: String = "",
    val eventTimestamp: Long = 0L
)