package tema;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTestMul {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals( "Regular multiplication should work", calculator.multiply(4,5), 20);
    }

    @Test
    public void testMultiplyWithZero() {
        Assert.assertEquals("Multiple with zero should be zero",0,  calculator.multiply(0,5));
        Assert.assertEquals("Multiple with zero should be zero", 0, calculator.multiply(5,0));
    }
}