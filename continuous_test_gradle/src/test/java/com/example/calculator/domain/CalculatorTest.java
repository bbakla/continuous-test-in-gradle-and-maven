package com.example.calculator.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class CalculatorTest {

    @Test
    void canSumIntegers() {
        var calculator = new Calculator();
        int actual = calculator.sum(5, 6);

        assertThat(actual).isEqualTo(11);
    }

    @Test
    void willFail() {
        fail("fail");
    }

    @Test
    void willThrowException() {
        throw  new NullPointerException();
    }
}
