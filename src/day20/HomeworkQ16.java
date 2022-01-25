package day20;

public class HomeworkQ16 {
	
	public static void main(String [] args) {
		
		HomeworkQ16 obj = new HomeworkQ16();
		
		String result1 = obj.concatString("Java", "awesome");
		String result2 = obj.concatString("food", "door");
		String result3 = obj.concatString("java", "training");
		String result4 = obj.concatString("Pro", "ogress");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	
	String concatString(String strOne, String strTwo) {
		String result = "";
		
	
		result = strOne.concat(strTwo);
		
		return result;
	}

}

/**
16. Write a method to concatenate two given strings such that, if the concatenation creates
a double characters then removes one of the characters.
a. For example strOne = “food”; strTwo =”door”. After concatenating two
strings it will give us “fooddoor”(dd is double character, remove one of the
d) then the string after concatenation are: “foodoor”

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: concatString
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
concatString (“Java”, “awesome”) ----- javawesome
concatString (“food”, “door”) ----- foodoor
concatString (“java”, “training”) ----- javatraining
concatString (“Pro”, “ogress”) ----- Progress
*/