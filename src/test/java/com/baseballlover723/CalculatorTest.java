package com.baseballlover723;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		Assert.assertEquals(calc.add(1, 2), 3);
	}
	
	@Test
	public void testAbsoluteAdd() {
		Calculator calc = new Calculator();
		Assert.assertEquals(calc.absoluteAdd(1, 2), 3);
	}
}
