package com.company;

import com.company.firstway.Calculator;
import com.company.firstway.CalculatorThird;
import com.company.secondway.CalculatorSecond;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.plus();

        CalculatorThird calculatorThird = new CalculatorThird();
        calculatorThird.multiplication();
        calculatorThird.factorial();

        CalculatorSecond calculatorSecond = new CalculatorSecond();
        calculatorSecond.degree();
        calculatorSecond.minus();
    }
}
