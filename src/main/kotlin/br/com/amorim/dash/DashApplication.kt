package br.com.amorim.dash

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DashApplication

fun main(args: Array<String>) {
	runApplication<DashApplication>(*args)
}
