package com.dickow.calculator.operations

import com.dickow.calculator.operations.interfaces.Operation

class Divide constructor(private val _value : Float) : Operation {
    override fun execute(value: Float): Float {
        if(_value == 0F){
            throw ArithmeticException("Divide by zero")
        }
        return value/_value
    }
}