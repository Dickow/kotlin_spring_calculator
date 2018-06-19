package com.dickow.calculator.web.api.shared.dto

class CalculationDTO{
    var currentResult : Float = 0F
    lateinit var operations : List<OperationDTO>
}

class OperationDTO{
    lateinit var type: CalculationOperation
    var value : Float = 0F
}

enum class CalculationOperation{
    Add,
    Subtract,
    Divide,
    Multiply
}