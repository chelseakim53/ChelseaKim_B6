package day22;

public class JavaNullHw2 {
	
	public static void main (String [] args) {
		
		JavaNullHw2 obj = new JavaNullHw2();
		
		boolean result1 = obj.isEndWith("java training", "ing");
		boolean result2 = obj.isEndWith("java training", "ng");
		boolean result3 = obj.isEndWith("java training", "java");
		boolean result4 = obj.isEndWith("java training", "train");
		boolean result5 = obj.isEndWith(null, "java");
		boolean result6 = obj.isEndWith(null, null);
		boolean result7 = obj.isEndWith("aaabc", "abc");
		boolean result8 = obj.isEndWith("abc", null);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		
	}
	
	boolean isEndWith(String strOne, String strTwo) {
		  boolean result = false;
		  
		  if (strOne != null && strOne.endsWith(strTwo)) {
			  result = true;
		  } else if (strOne == null){
			  result = false;
		  }
		  
		  return result;
	}
 
}

/**
2. Write a method to check whether a given string ends
with the contents(Characters) of another string
Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isEndWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isEndWith (“java training”, “ing”) ----- TRUE
isEndWith (“java training”, “ng”) ----- TRUE
isEndWith (“java training”, “java”) ----- False
isEndWith (“java training”, “train”) ----- False
isEndWith (null , “java”) ----- False
isEndWith (null , null) ----- False
isEndWith (“aaabc”, “abc”) ----- TRUE
isEndWith (“abc”, null) ----- False
----------------------------------------------------------------------------------------------------------------
*/