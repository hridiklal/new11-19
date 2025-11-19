package com.example;

/**
 * Main application class for CICD Demo
 */
public class App {
    
    /**
     * Main method - application entry point
     */
    public static void main(String[] args) {
        System.out.println("CICD Demo Application Started!");
        
        Calculator calculator = new Calculator();
        
        // Demonstrate some calculations
        int a = 10;
        int b = 5;
        
        System.out.println("Addition: " + a + " + " + b + " = " + calculator.add(a, b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + calculator.multiply(a, b));
        
        try {
            System.out.println("Division: " + a + " / " + b + " = " + calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Division error: " + e.getMessage());
        }
        
        System.out.println("Application Completed Successfully!");
    }
}

/**
 * Calculator class with basic arithmetic operations
 */
class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    public boolean isPositive(int number) {
        return number > 0;
    }
}
