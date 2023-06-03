package com.brewgenius

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrewGeniusApplication

fun main(args: Array<String>) {
	runApplication<BrewGeniusApplication>(*args)
}
