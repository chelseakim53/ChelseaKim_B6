package day12;

public class MultipleOfHw {
	
	public static void main (String [] args) {
		
		boolean result = multipleOf (3);
		boolean result2 = multipleOf (10);
		boolean result3 = multipleOf (8);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	public static boolean multipleOf (int num1) {
		
		boolean result = false;
		
		if (num1 >= 0 && num1 % 3 == 0 || num1 % 5 == 0) {
			result = true;
		}
			else {
				result = false;
			}
			
		
		return result;
	}
}


/**

2) Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
"mod" operator
multipleOf (3) --- true
multipleOf (10) ---  true
multipleOf (8) ---  false


*/