package co.s4n;

public class ArithmeticOperations {
	
	/**
	 * this method evaluate if a number is multiple of other number
	 * @param number, number to validate. 
	 * @param multiple, integer to verify
	 * @return true if the number is multiple of parameter 'multiple', false in another case
	 */
	
	public static boolean evaluateMultiple(int number, int multiple) {
		return number % multiple == 0;		
	}
}
