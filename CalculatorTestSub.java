package tema;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTestSub {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testSub() {
        Assert.assertEquals( "Regular substraction should work", calculator.substract(4,5), -1);
    }

    @Test
    public void testSubZero() {
        Assert.assertEquals("Substraction with zero should work", calculator.substract(5,0), 5);
    }
}