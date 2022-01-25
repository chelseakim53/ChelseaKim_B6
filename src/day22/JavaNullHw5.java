package day22;

public class JavaNullHw5 {
	
	public static void main (String [] args) {
		
		String result1 = removeSpace(null);
		String result2 = removeSpace(" Java Training ");
		String result3 = removeSpace(" I like to practice ");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}
	public static String removeSpace(String strOne) {
		String result = "";
		
		if (strOne != null) {
			result = strOne.trim();
		} else if (strOne == null) {
			result = null;
		}
		
		return result;
		
	}
}

/**
5. Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data:
removeSpace (null”) ----- null
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice
*/