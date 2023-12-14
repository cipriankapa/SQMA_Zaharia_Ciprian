package tema;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTestAdd {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals( "Regular addition should work", calculator.add(2,3), 5);
    }

    @Test
    public void testAddCumitativity() {
        Assert.assertEquals("Multiple with zero should be zero", calculator.add(2,3),  calculator.add(3,2));
    }
}