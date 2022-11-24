package org.calculator.italy;

public class Calcolatrice {
	
	private float number1;
	private float number2;
	
	public Calcolatrice() {
		
	}
	
	public float add(float number1, float number2) {
		
		return number1 + number2;
	}
	
	public float subtract(float number1, float number2) {
		
		if(number1 > number2) {
			return number1 - number2;
		}
		return number2 - number1;
	}
	
	public float divide(float number1, float number2) throws IllegalArgumentException {
		
		if(number1 == 0 || number2 == 0) {
			
			throw new IllegalArgumentException("the division for 0 is impossible");
			
		}
			
		if(number1 > number2) {
			
			return number1 / number2;
		}
		
		return number2 / number1;
	}
	
	public float multiply(float number1, float number2) {
		
		return number1 * number2;
	}
	
	@Override
	public String toString() {
		
		return "\nResult of the addition: " + add(number1, number2)
		+ "\nResult of the subtract: " + subtract(number1, number2)
		+ "\nResult of the division: " + divide(number1, number2)
		+ "\nResult of the multiply: " + multiply(number1, number2);
	}
	
}
