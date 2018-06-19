package com.dickow.calculator.web.api.mult.app

import com.dickow.calculator.web.api.mult.config.ApiConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(value = [ApiConfiguration::class])
class CalculatorWebApiMultApp

fun main(args: Array<String>) {
    SpringApplication.run(CalculatorWebApiMultApp::class.java, *args)
}