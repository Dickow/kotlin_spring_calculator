package com.dickow.calculator.web.api.sub.app

import com.dickow.calculator.web.api.sub.config.ApiConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(value = [ApiConfiguration::class])
class CalculatorWebApiSubApp

fun main(args: Array<String>) {
    SpringApplication.run(CalculatorWebApiSubApp::class.java, *args)
}