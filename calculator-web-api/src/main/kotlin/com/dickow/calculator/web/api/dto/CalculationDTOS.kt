package com.dickow.calculator.web.api.dto

class CalculationDTO{
    lateinit var operations : List<OperationDTO>
}
class OperationDTO{
    lateinit var type: CalculationOperation
    var value : Float = 0F
}
enum class CalculationOperation{
    Add,
    Subtract,
    Divide
}