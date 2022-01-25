package day22;

public class JavaNullHw1 {
	
	public static void main (String [] args) {
		JavaNullHw1 obj = new JavaNullHw1();
		
		String result1 = obj.toUpper("Pro");
		String result2 = obj.toUpper("java");
		String result3 = obj.toUpper(null);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	
	String toUpper(String strOne) {
		String result = null;
		
		if (strOne != null) {
			result = strOne.toUpperCase();
			
		} else if (strOne == null) {
			result = null;
		}
		
			
		
		return result;
	}

}


/**
1. Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (null) ----- null

*/