package modules

import consts.LocalConstants
import helper.userNotFound
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.loadSystemModule() {
    routing {
        get("/systems/{userId}") {
            val userId = call.parameters["userId"]

            val user = LocalConstants.users.find { it.id == userId }

            if (user == null) userNotFound()
            else call.respond(user.systems)
        }
    }
}