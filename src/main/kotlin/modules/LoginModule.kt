package modules

import consts.LocalConstants
import helper.badPassword
import helper.userNotFound
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import requests.LoginRequest
import responses.LoginResponse


fun Application.loadLoginModule() {
    routing {
        post("/login") {

            runBlocking { delay(2000) }

            val formParams = call.receive<LoginRequest>()
            val login: String = formParams.login
            val password: String = formParams.password

            val user = LocalConstants.users.find { it.username == login }
            if (user == null) {
                userNotFound()
                return@post
            }

            if (user.password == password) call.respond(LoginResponse(user.id))
            else badPassword()
        }
    }
}