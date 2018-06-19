package com.dickow.calculator.web.api.add.app

import com.dickow.calculator.web.api.add.config.ApiConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(value = [ApiConfiguration::class])
open class CalculatorWebApiAddApp

fun main(args: Array<String>) {
    SpringApplication.run(CalculatorWebApiAddApp::class.java, *args)
}