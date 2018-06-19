package com.dickow.calculator.web.api.sub.config

import com.dickow.calculator.web.api.shared.mapper.Mapper
import org.springframework.boot.web.server.ConfigurableWebServerFactory
import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(value = ["com.dickow.calculator.web.api.sub.controllers"])
class ApiConfiguration{
    @Bean
    fun mapper() = Mapper()

    @Bean
    fun serverCustomiser() = WebServerFactoryCustomizer<ConfigurableWebServerFactory>{
        factory -> factory.setPort(8084)
    }
}