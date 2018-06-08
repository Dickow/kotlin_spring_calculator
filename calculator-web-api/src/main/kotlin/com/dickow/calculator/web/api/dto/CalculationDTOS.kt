package com.dickow.calculator.web.api.dto

class CalculationDTO(){
    lateinit var operations : List<OperationDTO>
    constructor(operations : List<OperationDTO>):this(){
        this.operations = operations
    }
}
class OperationDTO(){
    lateinit var type: CalculationOperation
    var value : Float = 0F
    constructor(type: CalculationOperation, value: Float): this(){
        this.type = type
        this.value = value
    }
}
enum class CalculationOperation{
    Add,
    Subtract,
    Divide
}