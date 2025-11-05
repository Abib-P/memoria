package com.nainssa.infrastructure.controller.movie

import com.nainssa.core.movie.MovieService
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

fun Route.moviesRoute(movieService: MovieService) {
    route("/movies") {
        get {
            call.respond(movieService.getAllMovies())
        }
    }
}
