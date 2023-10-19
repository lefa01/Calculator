package com.hadf.calculatorapp

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("X")
    object Divide: CalculatorOperation("/")
}
