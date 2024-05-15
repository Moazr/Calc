package calculator;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author moazr
 */
public class CalculatorTest {
    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd1() {
        System.out.println("add");
        double num1 = 1;
        double num2 = 2;
        double expected = 3;
        assertEquals(expected, Calculator.add(num1, num2));
    }

    @Test
    public void testAdd2() {
        System.out.println("add");
        double num1 = 6;
        double num2 = 54;
        double expected = 60;
        assertEquals(expected, Calculator.add(num1, num2));
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");

        // TODO review the generated test code and remove the default call to fail.
        double num1 = 5.0;
        double num2 = 3.0;
        double expected = 2.0;
        double result = Calculator.subtract(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double num1 = 4;
        double num2 = 3;
        double expected = 12;
        assertEquals(expected, Calculator.multiply(num1, num2));
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide1() {
        System.out.println("divide");
        double num1 = 25.0;
        double num2 = 2.0;
        double expected = 12.5;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result, 0.0001);
    }
    
    @Test
    public void testDivide2() {
        System.out.println("divide");
        double num1 = 100000.0;
        double num2 = 50.0;
        double expected = 2000.0;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result, 0.0001);
    }

}
