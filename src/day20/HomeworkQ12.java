package day20;

public class HomeworkQ12 {
	
	public static void main (String [] args) {
		
		replaceStr("I cannot do it", "cannot", "can");
		replaceStr("Tomorrow is my day", "Tomorrow", "Today");
		
		
	}
	
	public static void replaceStr(String strOne, String oldStr, String newStr) {//void doesnt return a result
		
		String result = strOne.replace(oldStr, newStr);
		System.out.println(result);
	}
	

}

/**
12. Write a method to replace each substring of a given string that matches the given
regular expression with the given replacement. The method takes 3 String parameters
and replaces oldStr (parameter 2 ) from strOne (parameter1) with newStr(parameter
3) and prints the new value

Access Modifier: public
Non-Access Modifier: static
Return Type: void
Method Name: replaceStr
Parameter1: String strOne
Parameter2: String oldStr
Parameter2: String newStr
Test Data:
replaceStr (“I cannot do it”, “cannot”, “can” ) ----- I can do it
replaceStr (“Tomorrow is my day”, “Tomorrow”, “Today” ) ----- Today is my day
*/