package co.s4n;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	public void verifyNormalNumber() {
		int number = 2;
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String result = fizzBuzz.checkFizzBuzz(number);
		
		assertEquals("2", result);
	}
	
	@Test
	public void verifyFizzMultipleThree() {
		int number = 6;
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String result = fizzBuzz.checkFizzBuzz(number);
		
		assertEquals("Fizz", result);
	}
	
	@Test
	public void verifyBuzzMultipleFive() {
		int number = 20;
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String result = fizzBuzz.checkFizzBuzz(number);
		
		assertEquals("Buzz", result);
	}
	
	@Test
	public void verifyFizzBuzzMultiplefifteen() {
		int number = 60;
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String result = fizzBuzz.checkFizzBuzz(number);
		
		assertEquals("FizzBuzz", result);
	}

}
