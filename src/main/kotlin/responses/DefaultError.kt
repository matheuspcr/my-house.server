package responses

import kotlinx.serialization.Serializable

@Serializable
data class DefaultError(val message: String)