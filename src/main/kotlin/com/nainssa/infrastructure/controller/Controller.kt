package com.nainssa.infrastructure.controller

import io.ktor.server.application.Application

interface Controller {
    fun registerRoutes(app: Application)
}
