package entities

import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class System(
    val name: String,
    val devices: List<Device>,
    var enabled: Boolean = false,
    val id: String
) {
    val devicesCount: Int
        get() = devices.size
}
