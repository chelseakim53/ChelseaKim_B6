package day19;

public class HwQuestion6 {
	
	public static void main(String [] args) {
		
		String s1 = combineStr("day", "ONE", "work","HOURS");
		System.out.println(s1);
		
		String s2 = combineStr("week", "weekend", "monday","Tuesday");
		System.out.println(s2);
		
		String s3 = combineStr("restoN", "vA", "baltiMORE", "MD");
		System.out.println(s3);
		
		String s4 = combineStr("java", "is", "fun","LEARNING");
		System.out.println(s4);
		
		
	}
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String Myresult = "";
		
		String result1 = strOne.toUpperCase();
		System.out.println(result1);
		
		String result2 = strTwo.toLowerCase();
		System.out.println(result2);
		
		String result3 = strThree.toUpperCase();
		System.out.println(result3);
		
		String result4 = strFour.toLowerCase();
		System.out.println(result4);
		
		String result5 = result1.concat(result2.concat(result3.concat(result4)));
		System.out.println(result5);
		
		return Myresult;
	}

}
/**
6. Write a method that takes four String parameters, the method
a. converts parameter 1 and parameter 3 to uppercase,
b. converts parameter 2 and parameter 4 to lower case
c. Then the method concatenates all four parameters and return the new String
value.

Access Modifier: protected
Non-Access Modifier: static
Return Type: String
Method Name: combineStr
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Parameter3: String strFour
Test Data:
combineStr (“day”, “ONE”, “work”,”HOURS”) ----- DAYoneWORKhours
combineStr (“week”, “weekend”, “monday”,”Tuesday”) - WEEKweekendMONDAYtuesday
combineStr (“restoN”, “vA”, “baltiMORE”, “MD”) ----- RESTONvaBALTIMOREmd
combineStr (“java”, “is”, “fun”,”LEARNING”) --- JAVAisFUNlearning

----------------------------------------------------------------------------------------------------------------
*/