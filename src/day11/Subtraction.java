package day11;

public class Subtraction {
	public static void main (String [] args) {
		
		int diffTotal1 = difference21(19);
		int diffTotal2 = difference21 (10);
		int diffTotal3 = difference21 (30);
		int diffTotal4 = difference21 (21);
		
		System.out.println(diffTotal1);
		System.out.println(diffTotal2);
		System.out.println(diffTotal3);
		System.out.println(diffTotal4);
		
	}
	public static int difference21 (int number) {
		
		int result = 0;
		
		if (number <= 21) {
			result = number-21;
		} else {
			result = (number-21)*2;
		}
	return result;
	}
}
