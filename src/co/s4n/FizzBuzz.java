package co.s4n;

public class FizzBuzz {
	final private String FIZZ="Fizz";
	final private String BUZZ="Buzz";
	final private String FIZZBUZZ="FizzBuzz";
	
	/**
	 * this method evaluates if a number is multiple of 3, 5 y 15.
	 * @param number, number to validate. 
	 * @return String that contend the value FizzBuzz, Fizz, Buzz 
	 * or the number if it is not multiple of 3, 5, or 15.
	 */
	
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
	
	/**
	 * this method prints the numbers from 1 to 100. But for
	   multiples of three print "Fizz" instead of the number and for
	   the multiples of five print "Buzz". For numbers which are
	   multiples of both three and five print "FizzBuzz".
	 * @param from, initial number.
	 * @param from, final number. 
	 * @return this method does not return anithing.
	 */
	public void printFizzBuzz(int from, int to) {
		for (int i=from; i<=to; i++) {
			System.out.println( checkFizzBuzz(i) );			
		}
	}
}
