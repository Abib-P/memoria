package com.nainssa.infrastructure.repository.google.movie

import com.nainssa.core.movie.Movie
import com.nainssa.core.movie.MovieRepository

class MovieGoogleSheetRepository : MovieRepository {
    override fun getAllMovies(): List<Movie> {
        return emptyList()
    }
}
