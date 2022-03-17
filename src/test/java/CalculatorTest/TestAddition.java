package CalculatorTest;

import Calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestAddition {
    @Test
    public void testSimpleAdd(){
        Calculator cal = new Calculator();
        assertEquals(3, cal.add(2, 2));
    }
}
