package com.example

import com.example.model.PostgresTaskRepository
import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
//    embeddedServer(
//        Netty,
//        port = 8080, // This is the port on which Ktor is listening
//        host = "0.0.0.0",
//        module = Application::module
//    ).start(wait = true)
}

fun Application.module() {
    val repository = PostgresTaskRepository()

    configureSerialization(repository)
    configureDatabases(environment.config)
    configureRouting()
}
