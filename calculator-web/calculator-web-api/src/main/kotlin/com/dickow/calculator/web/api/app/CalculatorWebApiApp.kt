package com.dickow.calculator.web.api.app

import com.dickow.calculator.web.api.config.ApiConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(value = [ApiConfiguration::class])
class CalculatorWebApiApp

fun main(args: Array<String>) {
    SpringApplication.run(CalculatorWebApiApp::class.java, *args)
}