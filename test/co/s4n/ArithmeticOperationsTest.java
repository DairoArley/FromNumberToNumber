package co.s4n;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticOperationsTest {

	@Test
	public void verifyMultipleThree() {
		int number = 9;
		
		boolean result = ArithmeticOperations.evaluateMultiple(number, 3);
		
		assertTrue(result);
	}
	
	@Test
	public void verifyMultipleFive() {
		int number = 25;
		
		boolean result = ArithmeticOperations.evaluateMultiple(number, 5);
		
		assertTrue(result);
	}
	
	@Test
	public void verifyMultipleFifteen() {
		int number = 90;
		
		boolean result = ArithmeticOperations.evaluateMultiple(number, 15);
		
		assertTrue(result);
	}
	
	@Test
	public void verifyMultipleDifferent() {
		int number = 7;
		
		boolean result = ArithmeticOperations.evaluateMultiple(number, 3);
		
		assertFalse(result);
	}

}
