package responses

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val userId: String
)
