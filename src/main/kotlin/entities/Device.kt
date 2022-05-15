package entities

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class Device(
    val status: Status,
    val nickname: String,
    val hardwareID: String
) {
    var id: String
        private set

    init {
        id = UUID.randomUUID().toString()
    }

    enum class Status {
        OPEN,
        CLOSE,
        OFFLINE
    }
}
