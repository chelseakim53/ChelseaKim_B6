package day12;

public class PosNegHw {
	
	public static void main (String [] args) {
		
		boolean result1 = posNeg(1, -1, false);
		boolean result2 = posNeg(-1, 1, false);
		boolean result3 = posNeg(-4, -5, true);
	
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	
	public static boolean posNeg (int num1, int num2, boolean value) {
		
		boolean result = false;
		
		if ((num1 < 0 && num2 >0 && value == false) || (num1 > 0 && num2 < 0 && value == false)) {
			
			result = true; 
		}
			else if (num1 < 0 && num2 < 0 && value == true) {
				result = true;
			} else {
				result = false;
			}
		
			return result;
			
		}
	}




/**

1) Given 2 int values and 1 boolean value, return true if one is negative and one is positive and
boolean value is false. Except if the boolean parameter is true, then return true only if both
are negative.
posNeg (1, -1, false) ---  true
posNeg (-1, 1, false) ---  true
posNeg (-4, -5, true) ---  true


*/
