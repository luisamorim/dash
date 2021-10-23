package br.com.amorim.dash

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class DashApplication

fun main(args: Array<String>) {
	runApplication<DashApplication>(*args)
}


@Controller
@RequestMapping("/home")
class HomeController{

	@GetMapping()
	fun home():String{
		return "home"
	}

}