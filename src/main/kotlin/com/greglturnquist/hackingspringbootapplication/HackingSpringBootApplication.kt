package com.greglturnquist.hackingspringbootapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HackingSpringBootApplication

fun main(args: Array<String>) {
    runApplication<HackingSpringBootApplication>(*args)
}
