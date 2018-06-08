package com.dickow.calculator.web.api.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(value = ["com.dickow.calculator.web.api.controllers"])
open class ApiConfiguration