package com.nainssa.infrastructure.controller.movie

import com.nainssa.core.movie.MovieService
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.moviesRoute(movieService: MovieService) {
    route("/movies") {
        get {
            call.respond(movieService.getAllMovies())
        }
    }
}
