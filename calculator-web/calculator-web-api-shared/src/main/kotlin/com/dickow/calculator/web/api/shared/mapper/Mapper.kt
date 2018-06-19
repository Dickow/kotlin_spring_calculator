package com.dickow.calculator.web.api.shared.mapper

import com.dickow.calculator.operations.Add
import com.dickow.calculator.operations.Divide
import com.dickow.calculator.operations.Multiply
import com.dickow.calculator.operations.Subtract
import com.dickow.calculator.operations.interfaces.Operation
import com.dickow.calculator.web.api.shared.dto.CalculationOperation
import com.dickow.calculator.web.api.shared.dto.OperationDTO

class Mapper {
    fun map(operation: OperationDTO) : Operation {
        return when(operation.type){
            CalculationOperation.Add -> Add(operation.value)
            CalculationOperation.Subtract -> Subtract(operation.value)
            CalculationOperation.Divide -> Divide(operation.value)
            CalculationOperation.Multiply -> Multiply(operation.value)
        }
    }
}