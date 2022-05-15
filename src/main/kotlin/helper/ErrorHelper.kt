package helper

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.util.pipeline.*
import responses.DefaultError

suspend fun PipelineContext<Unit, ApplicationCall>.userNotFound() { call.respond(HttpStatusCode.BadRequest, DefaultError("Usuário não encontrado!")) }

suspend fun PipelineContext<Unit, ApplicationCall>.systemNotFound() { call.respond(HttpStatusCode.BadRequest, DefaultError("Sistema não encontrado!")) }

suspend fun PipelineContext<Unit, ApplicationCall>.deviceNotFound() { call.respond(HttpStatusCode.BadRequest, DefaultError("Dispositívo não encontrado!")) }

suspend fun PipelineContext<Unit, ApplicationCall>.badPassword() { call.respond(HttpStatusCode.BadRequest, DefaultError("Senha incorreta!")) }