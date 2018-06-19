package com.dickow.calculator.web.api.div.app

import com.dickow.calculator.web.api.div.config.ApiConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(value = [ApiConfiguration::class])
class CalculatorWebApiDivApp

fun main(args: Array<String>) {
    SpringApplication.run(CalculatorWebApiDivApp::class.java, *args)
}