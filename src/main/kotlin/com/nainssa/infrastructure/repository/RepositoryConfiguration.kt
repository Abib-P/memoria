package com.nainssa.infrastructure.repository

import com.nainssa.core.movie.MovieRepository
import com.nainssa.infrastructure.repository.google.movie.MovieGoogleSheetRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<MovieRepository> { MovieGoogleSheetRepository() }
}
