package com.dickow.calculator.web.api.sub.controllers

import com.dickow.calculator.Calculator
import com.dickow.calculator.web.api.shared.dto.CalculationDTO
import com.dickow.calculator.web.api.shared.dto.OperationDTO
import com.dickow.calculator.web.api.shared.mapper.Mapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("calculator")
class CalculatorController @Autowired constructor(private val mapper: Mapper){

    @PostMapping("sub")
    fun calculate(@RequestBody body: CalculationDTO) : Float{
        val operations = body.operations.map { operation: OperationDTO -> mapper.map(operation) }
        return Calculator(0F).exec(operations).result()
    }
}