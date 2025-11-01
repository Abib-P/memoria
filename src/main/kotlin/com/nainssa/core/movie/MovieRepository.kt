package com.nainssa.core.movie

interface MovieRepository {
    fun getAllMovies(): List<Movie>
}
