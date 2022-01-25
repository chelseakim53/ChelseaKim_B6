package day22;

public class JavaNullHw6 {
	
	public static void main (String [] args) {
		
		JavaNullHw6 obj = new JavaNullHw6();
		
		boolean result1 = obj.endsWithNG(null);
		boolean result2 = obj.endsWithNG("I like to practice");
		boolean result3 = obj.endsWithNG("Everyone is practicing");
		boolean result4 = obj.endsWithNG("I am studying");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	public boolean endsWithNG(String strOne) {
		boolean result = false;
		
		if (strOne == null) {
			result = false;
			
		} else if (strOne != null && strOne.endsWith("ng")) {
			result = true;
		}
		
		return result;
	}

}

/**
6. Write a method that takes a string parameter and return true if the string parameter
ends in "ng"

Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne
Test Data:
endsWithNG (null) ----- FALSE
endsWithNG (“I like to practice”) ----- FALSE
endsWithNG (“Everyone is practicing”) ----- TRUE
endsWithNG (“I am studying”) ----- TRUE
*/