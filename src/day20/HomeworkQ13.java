package day20;

public class HomeworkQ13 {
	
	public static void main(String [] args) {//call obj because static method w/ nonstatic 
		
		HomeworkQ13 obj = new HomeworkQ13();
		
		boolean result1 = obj.isStartWith("java training", "ing"); //false
		boolean result2 = obj.isStartWith("java training", "ja"); //tru
		boolean result3 = obj.isStartWith("java training", "java"); //true
		boolean result4 = obj.isStartWith("java training", "train"); //false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	boolean isStartWith(String strOne, String strTwo) {
		boolean result = false;
		
		result = strOne.startsWith(strTwo);
		
		return result;
	}
}

/**
13. Write a method to check whether a given string starts with the contents(Characters) of
another string

Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isStartWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isStartWith (“java training”, “ing”) ----- False
isStartWith (“java training”, “ja”) ----- TRUE
isStartWith (“java training”, “java”) ----- TRUE
isStartWith (“java training”, “train”) ----- False
*/