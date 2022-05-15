package entities

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val username: String,
    val password: String,
    val id: String,
    val systems: List<System>
)
