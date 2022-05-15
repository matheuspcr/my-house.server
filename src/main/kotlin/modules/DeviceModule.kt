package modules

import consts.LocalConstants
import helper.systemNotFound
import helper.userNotFound
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.loadDeviceModule() {
    routing {
        get("/devices/{userId}/{systemId}") {
            val userId = call.parameters["userId"]
            val systemId = call.parameters["systemId"]

            val user = LocalConstants.users.find { it.id == userId }

            if (user == null) {
                userNotFound()
                return@get
            }

            val system = user.systems.find { it.id == systemId }

            if (system == null) {
                systemNotFound()
                return@get
            } else {
                call.respond(system.devices)
            }
        }
    }
}