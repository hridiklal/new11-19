package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the CICD Demo Application
 */
public class AppTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    void testAddition() {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(-5, calculator.add(-10, 5));
        assertEquals(0, calculator.add(0, 0));
    }
    
    @Test
    void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-15, calculator.subtract(-10, 5));
        assertEquals(0, calculator.subtract(5, 5));
    }
    
    @Test
    void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(-50, calculator.multiply(-10, 5));
        assertEquals(0, calculator.multiply(0, 5));
    }
    
    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5));
        assertEquals(-2.0, calculator.divide(-10, 5));
        assertEquals(0.0, calculator.divide(0, 5));
    }
    
    @Test
    void testDivisionByZero() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
    
    @Test
    void testIsPositive() {
        assertTrue(calculator.isPositive(10));
        assertFalse(calculator.isPositive(-5));
        assertFalse(calculator.isPositive(0));
    }
    
    @Test
    void testMainMethod() {
        // Test that main method runs without exceptions
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
