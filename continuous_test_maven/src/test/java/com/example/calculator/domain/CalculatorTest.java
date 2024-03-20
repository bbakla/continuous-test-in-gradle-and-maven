package com.example.calculator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

 class CalculatorTest {

    @Test
    void canSumIntegers() {
        var calculator = new Calculator();
        var actual = calculator.sum(3, 6);

        assertThat(actual).isEqualTo(9);
    }

    @Test
     void canCalculateNegatives() {
        var calculator = new Calculator();
        var actual = calculator.sum(-5, -6);

        assertThat(actual).isEqualTo(-11);
    }

    @Test
     void canMultiplyIntegers() {
        var calculator = new Calculator();
        var actual = calculator.multiply(5, 6);

        assertThat(actual).isEqualTo(30);
    }

    @Test
     void throwException() {
        throw new NullPointerException();
    }
}

