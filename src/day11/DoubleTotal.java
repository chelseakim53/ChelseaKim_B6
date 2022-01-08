package day11;

public class DoubleTotal {
	
	public static void main (String [] args) {
		
		int myTotal1 = sumDouble (1,2);
		int myTotal2 = sumDouble (3,2);
		int myTotal3 = sumDouble (2,2);
		
		System.out.println(myTotal1);
		System.out.println(myTotal2);
		System.out.println(myTotal3);
		
	}

	public static int sumDouble (int valueOne, int valueTwo) {
		
		int result = 0;
		
		if ((valueOne == valueTwo )) {
			result = (valueOne + valueTwo)*2;
			
			
		} else {
			result = (valueOne + valueTwo);
		}
		return result;
	}
}
