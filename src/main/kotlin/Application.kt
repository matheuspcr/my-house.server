import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import kotlinx.serialization.json.Json
import modules.loadDeviceModule
import modules.loadLoginModule
import modules.loadSystemModule

fun main() {

    embeddedServer(Netty, port = 8000, host = "0.0.0.0") {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }


        loadLoginModule()
        loadSystemModule()
        loadDeviceModule()

    }.start(wait = true)

}