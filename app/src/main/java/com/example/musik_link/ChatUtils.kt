package com.example.musik_link

import kotlinx.serialization.Serializable

@Serializable
data class ChatConversation (
    val chatId: String = "",
    val participants: List<String> = emptyList(),
    val lastMesagge: String = "",
    val lastTimeTimestamp: Long = 0L
)

@Serializable
data class ChatMessage(
    val messageId: String = "",
    val senderId: String = "",
    val text: String = "",
    val timestamp: Long = 0L
)