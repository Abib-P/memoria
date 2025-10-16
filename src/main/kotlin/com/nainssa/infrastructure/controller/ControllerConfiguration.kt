package com.nainssa.infrastructure.controller

import com.nainssa.infrastructure.controller.movie.MovieController
import io.ktor.server.application.*


fun Application.controllers() {
    val controllers: List<Controller> = listOf(
        MovieController()
    )

    controllers.forEach { it.registerRoutes(this) }
}

