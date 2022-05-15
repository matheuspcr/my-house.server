package consts

import entities.Device
import entities.System
import entities.User

object LocalConstants {
    val devices = listOf(
        Device(Device.Status.OPEN, "Porta principal", "AA32DSS439ID"),
        Device(Device.Status.CLOSE, "Janela da Sala 1", "BB32DSS439ID"),
        Device(Device.Status.CLOSE, "Janela da Sala 2", "CC32DSS439ID"),
        Device(Device.Status.OFFLINE, "Porta Quarto", "DD32ZSS439ID")
    )
    val systems = listOf(
        System("Casa da Praia", devices, true, "73c33fa5-ec6b-49a1-b0f5-85d7c412f4uf"),
        System("Casa de Campo", listOf(), false, "73c33fa5-ec6b-49a1-b0f5-85d7c412f4vx")
    )
    val users = listOf(
        User("matheus.crescencio", "Teste@123", "73c33fa5-ec6b-49a1-b0f5-85d7c412f4ae", systems),
        User("gustavo.paes", "ab12345", "5009f10f-fd2b-4ac9-afa8-889c08cb327b", listOf()),
        User("EmillY", "@1234", "147fd87e-b7af-4a1e-acdc-7144b8c713e5", listOf()),
        User("a", "123", "147fd87e-b7af-4a1e-acdc-7144b8c713e7", systems)
    )
}