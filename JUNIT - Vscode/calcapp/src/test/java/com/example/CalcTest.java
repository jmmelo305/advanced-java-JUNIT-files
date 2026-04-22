package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit 5 test suite for the {@link Calculator} class.
 * Covers all six operations: add, subtract, multiply, divide, power, and sqrt.
 * Each test verifies a specific behavior or edge case.
 */
class CalcTest {

    /** The Calculator instance shared across all tests in this class. */
    Calculator calc;

    /**
     * Runs before each test method.
     * Creates a fresh Calculator instance to ensure tests are independent.
     */
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    /**
     * Verifies that adding two positive numbers returns the correct sum.
     */
    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2, 3));
    }

    /**
     * Verifies that subtracting two positive numbers returns the correct difference.
     */
    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(3, 2));
    }

    /**
     * Verifies that multiplying two positive numbers returns the correct product.
     */
    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2, 3));
    }

    /**
     * Verifies that dividing two positive numbers returns the correct quotient.
     */
    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6, 3));
    }

    /**
     * Verifies that dividing by zero throws an {@link ArithmeticException}.
     */
    @Test
    void testDivideByZero() {
        // Expect an ArithmeticException when the divisor is 0
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }

    /**
     * Verifies that raising a base to a positive exponent returns the correct result.
     */
    @Test
    void testPower() {
        assertEquals(8.0, calc.power(2, 3));
    }

    /**
     * Verifies that the square root of a perfect square returns the correct result.
     */
    @Test
    void testSqrt() {
        assertEquals(3.0, calc.sqrt(9));
    }
}