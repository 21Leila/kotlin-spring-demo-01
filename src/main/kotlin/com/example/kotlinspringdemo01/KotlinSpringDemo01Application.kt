package com.example.kotlinspringdemo01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringDemo01Application

fun main(args: Array<String>) {
	runApplication<KotlinSpringDemo01Application>(*args)
}
