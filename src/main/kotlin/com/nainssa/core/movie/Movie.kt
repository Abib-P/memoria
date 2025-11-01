package com.nainssa.core.movie

import java.util.Date

data class Movie(
    val id: Long,
    val title: String,
    val frenchTitle: String,
    val releaseDate: Date,
    val durationMinutes: Int,
    val director: Person,
    val actors: List<Person>,
    val genres: List<String>,
    val watched: Boolean,
    val notes: String,
    ) {
}
