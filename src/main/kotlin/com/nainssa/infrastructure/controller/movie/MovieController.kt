package com.nainssa.infrastructure.controller.movie

import com.nainssa.infrastructure.controller.Controller
import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

class MovieController : Controller {
    override fun registerRoutes(app: Application) {
        app.routing {
            getMovies()
        }
    }

    private fun Routing.getMovies() {
        get("/movies") {
            call.respondText("List of movies")
        }
    }
}
