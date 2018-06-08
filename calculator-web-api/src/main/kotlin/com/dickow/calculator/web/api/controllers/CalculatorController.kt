package com.dickow.calculator.web.api.controllers

import com.dickow.calculator.Calculator
import com.dickow.calculator.operations.Add
import com.dickow.calculator.operations.Divide
import com.dickow.calculator.operations.Subtract
import com.dickow.calculator.operations.interfaces.Operation
import com.dickow.calculator.web.api.dto.CalculationDTO
import com.dickow.calculator.web.api.dto.CalculationOperation
import com.dickow.calculator.web.api.dto.OperationDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("calculator")
class CalculatorController {

    @PostMapping("")
    fun calculate(@RequestBody body: CalculationDTO) : Float{
        val operations = body.operations.map { operation: OperationDTO -> this.mapOperation(operation) }
        return Calculator(0F).exec(operations).result()
    }

    private fun mapOperation(operation: OperationDTO) : Operation {
        return when(operation.type){
            CalculationOperation.Add -> Add(operation.value)
            CalculationOperation.Subtract -> Subtract(operation.value)
            CalculationOperation.Divide -> Divide(operation.value)
        }
    }
}