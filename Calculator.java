// Name : Dheer Ajmera | PRN : 23070126035 | Batch : 2023-27, AIML A2

// Calculator.java
// Handles all calculation-related functionality.
public class Calculator {
    // Adds two numbers and returns the result.
    public double add(double a, double b) {
        return a + b;
    }

    // Subtracts the second number from the first and returns the result.
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplies two numbers and returns the result.
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divides the first number by the second, with a check to prevent division by zero.
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Calculates the nth Fibonacci number using recursion.
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Calculates the sum of all elements in the array.
    public double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    // Calculates the mean of the elements in the array.
    public double meanArray(double[] array) {
        return sumArray(array) / array.length;
    }

    // Calculates the variance of the elements in the array.
    public double varianceArray(double[] array) {
        double mean = meanArray(array);
        double variance = 0;
        for (double num : array) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / array.length;
    }

    // Calculates the standard deviation of the elements in the array.
    public double stdDevArray(double[] array) {
        return Math.sqrt(varianceArray(array));
    }
}