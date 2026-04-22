package com.example;

/**
 * A simple Calculator class that supports basic arithmetic operations.
 * Each method performs input validation and throws the appropriate exception
 * when inputs are illegal.
 */
public class Calculator {

    /**
     * Adds two numbers together.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers together.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * Throws an exception if the divisor is zero.
     *
     * @param a the dividend
     * @param b the divisor (must not be zero)
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        // Division by zero is undefined — throw immediately
        if (b == 0) {
            throw new ArithmeticException("Cannot Divide by Zero");
        }
        return a / b;
    }

    /**
     * Raises a base number to a non-negative integer exponent.
     * Throws an exception if the exponent is negative.
     *
     * @param base the base number
     * @param exp  the exponent (must be >= 0)
     * @return base raised to the power of exp
     * @throws IllegalArgumentException if exp is negative
     */
    public double power(double base, int exp) {
        // Negative exponents are not supported
        if (exp < 0) {
            throw new IllegalArgumentException("Exponent cannot be negative");
        }
        return Math.pow(base, exp);
    }

    /**
     * Computes the square root of a non-negative number.
     * Throws an exception if the input is negative.
     *
     * @param a the number to take the square root of (must be >= 0)
     * @return the square root of a
     * @throws IllegalArgumentException if a is negative
     */
    public double sqrt(double a) {
        // Square root of a negative number is not a real number
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative numbers");
        }
        return Math.sqrt(a);
    }
}