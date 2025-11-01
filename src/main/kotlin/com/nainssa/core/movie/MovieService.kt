package com.nainssa.core.movie

class MovieService(val movieRepository: MovieRepository) {
    fun getAllMovies(): List<Movie> {
        return movieRepository.getAllMovies()
    }
}
