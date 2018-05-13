package co.s4n;

public class FizzBuzz {
	final private String FIZZ="Fizz";
	final private String BUZZ="Buzz";
	final private String FIZZBUZZ="FizzBuzz";
	
	public String checkFizzBuzz(int number) {	
				
		if (ArithmeticOperations.evaluateMultiple(number, 15)) {
			return FIZZBUZZ;
		} 
		if (ArithmeticOperations.evaluateMultiple(number, 3)) {
			return FIZZ;
		} 
		if (ArithmeticOperations.evaluateMultiple(number, 5)) {
			return BUZZ;
		}
		return Integer.toString(number);		
	}
	
	public void printFizzBuzz(int from, int to) {
		for (int i=from; i<=to; i++) {
			System.out.println( checkFizzBuzz(i) );			
		}
	}
}
