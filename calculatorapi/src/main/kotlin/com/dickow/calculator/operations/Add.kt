package com.dickow.calculator.operations

import com.dickow.calculator.operations.interfaces.Operation

class Add constructor(private val _value: Float) : Operation {
    override fun execute(value: Float): Float {
        return _value + value
    }
}