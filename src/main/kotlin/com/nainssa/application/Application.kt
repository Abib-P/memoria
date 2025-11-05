package com.nainssa.application

import com.nainssa.core.coreModule
import com.nainssa.core.movie.MovieService
import com.nainssa.infrastructure.controller.movie.moviesRoute
import com.nainssa.infrastructure.repository.repositoryModule
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.routing.routing
import org.koin.ktor.ext.inject
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    install(Koin) {
        slf4jLogger()
        modules(
            coreModule,
            repositoryModule,
        )
    }

    val movieService by inject<MovieService>()

    routing {
        moviesRoute(movieService)
    }
}
