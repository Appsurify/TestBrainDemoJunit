package CalculatorTest;

import Calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestSubtraction {

    @Test
    public void testSimpleSubtract(){
        Calculator cal = new Calculator();
        assertEquals(0, cal.subtract(1, 1));
    }
}
