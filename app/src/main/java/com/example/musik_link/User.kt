package com.example.musik_link

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val uid: String = "",
    val name: String = "",
    val age: Int = 0,
    val gender: String = "",
    val country: String = "",
    val city: String = "",
    val instrument: String = "", //Lista cerrada
    val interest: String = "",
    val genres: List<String> = emptyList(),
    val bio: String = "",
    val profileImageUrl: String? = null,
    val socialMediaLinks: Map<String, String> = emptyMap(),
    val skills: List<String> = emptyList(),
    val gear: List<String> = emptyList(),
    val likes: Int = 0
)