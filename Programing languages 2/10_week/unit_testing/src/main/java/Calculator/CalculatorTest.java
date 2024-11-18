package Calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    // Test for the add method
    @Test
    public void testAdd() {
        Calculator calc = new Calculator(); // Creating an instance of Calculator
        int result = calc.add(2, 3); // Calling add method with 2 and 3
        assertEquals(5, result); // "2 + 3 should be 5"
    }

    // Test for the subtract method
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(3, 2);
        assertEquals(1, result); // "3 - 2 should be 1"
    }

    // Test for the multiply method
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        int result = calc.multiply(4, 5);
        assertEquals(20, result); // "4 * 5 should be 20"
    }

    // Test for the divide method with non-zero divisor
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 2);
        assertEquals(5, result);//"10 / 2 should be 5"
    }

    // Test for divide by zero
    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 0);
        assertEquals(Integer.MAX_VALUE, result); // "10 / 0 should return Integer.MAX_VALUE for error"
    }
}

