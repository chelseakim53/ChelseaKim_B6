package day20;

public class HomeworkQ15 {
	
	//static method
	public static void main (String [] args) {//no need to create an obj
		
		removeSpace(" Java Training ");
		removeSpace(" I like to practice ");
		
	}//static method
	public static String removeSpace(String strOne) {//non-void which means, needs to create a return
		String result = "";
		
		result = strOne.trim();
		
		return result;
		
	}
}
/**
15. Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data:
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice
*/