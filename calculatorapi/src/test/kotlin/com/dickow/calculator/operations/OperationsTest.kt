package com.dickow.calculator.operations

import com.dickow.calculator.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class OperationsTest{

    @Test
    fun test_add_1_and_2_equals_3(){
        val result = Calculator(0F).exec(Add(1F)).exec(Add(2F)).result()
        assertEquals(3.0F, result)
    }

    @Test
    fun test_add_1_and_negative1_equals_0(){
        val result = Calculator(0F).exec(Add(1F)).exec(Add(-1F)).result()
        assertEquals(0.0F, result)
    }

    @Test
    fun test_add_2_subtract_3_equals_negative1(){
        val result = Calculator(0F).exec(Add(2F)).exec(Subtract(3F)).result()
        assertEquals(-1.0F, result)
    }

    @Test
    fun test_divide_by_2(){
        val result = Calculator(10F).exec(Divide(2F)).result()
        assertEquals(5.0F, result)
    }

    @Test
    fun test_divide_by_zero(){
        assertThrows(ArithmeticException::class.java) {Calculator(10F).exec(Divide(0F))}
    }

    @Test
    fun test_add_5_subtract_3_divideby_4(){
        val result = Calculator(0F)
                .exec(Add(5F))
                .exec(Subtract(3F))
                .exec(Divide(4F))
                .result()
        assertEquals(0.5F, result)
    }

    @Test
    fun test_series_of_operations(){
        val operations = listOf(Add(5F), Subtract(3F), Divide(4F))
        val result = Calculator(0F).exec(operations).result()
        assertEquals(0.5F, result)
    }

    @Test
    fun test_multiply(){
        val result = Calculator(1F).exec(Multiply(10F)).result()
        assertEquals(10F, result)
    }

    @Test
    fun test_multiply_by_zero(){
        val result = Calculator(5F).exec(Multiply(0F)).result()
        assertEquals(0F, result)
    }
}