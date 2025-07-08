package com.ian.testsolinkeasykmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform