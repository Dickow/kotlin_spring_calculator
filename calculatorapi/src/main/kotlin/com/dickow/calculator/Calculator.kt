package com.dickow.calculator

import com.dickow.calculator.operations.interfaces.Operation

class Calculator constructor(private var _value: Float){

    fun exec(operation: Operation) : Calculator{
        _value = operation.execute(_value)
        return this
    }

    fun exec(operations: List<Operation>) : Calculator{
        operations.forEach({opr -> _value = opr.execute(_value)})
        return this
    }

    fun result(): Float{
        return _value
    }
}