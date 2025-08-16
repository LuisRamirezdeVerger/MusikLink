package com.example.musik_link

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val uid: String = "",
    val name: String = "",
    val instrument: String = "",
    val genres: List<String> = emptyList(),
    val bio: String = "",
    val profileImageUrl: String? = null,
    val socialMediaLinks: Map<String, String> = emptyMap(),
    val skills: List<String> = emptyList(),
    val gear: List<String> = emptyList()
)