package day20;

public class HomeworkQ14 {
	
	public static void main (String [] args) {
		
		getSubStr("java training", 2, 6);
		getSubStr("Software Development Engineer in TEST", 11, 23);
		getSubStr("Software Development Engineer in TEST", 21, 29);
		
	
		
	}
	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = "";
		
		result = str.substring(startingIndex, endingIndex);
		System.out.println(result);
		
		return result;
		
	}
}

/**
14. Write a method to get a substring of a given string between two specified positions.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex
Test Data:
getSubStr (“java training”, 2 ,6) ----- v at
getSubStr (“Software Development Engineer in TEST”, 11, 23) ----- velopment En
getSubStr (“Software Development Engineer in TEST”, 21, 29) ----- Engineer
*/