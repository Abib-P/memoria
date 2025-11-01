package com.nainssa.core

import com.nainssa.core.movie.MovieService
import org.koin.dsl.module

val coreModule = module {
    single { MovieService(get()) }
}
