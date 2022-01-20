package day19;

public class HwQuestion1 {
	public static void main(String[] args) {
		boolean result1 = isEqual("sDET", "sdet");
		boolean result2 = isEqual("testing", "testing");
		boolean result3 = isEqual("java", "java");
		boolean result4 = isEqual("java", "java Programming");

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

	static boolean isEqual(String strOne, String strTwo) {
		boolean result = false;

		if (strOne.equals(strTwo)) {
			result = true;
		} else
			result = false;
		return result;
	}

}

/**
 * 
 * 1. Write a method that takes two String parameter and checks if the two
 * strings are equal or not. If they are equal return true, otherwise return
 * false
 * 
 * Access Modifier: Default Non-Access Modifier: static Return Type: boolean
 * Method Name: isEqual Parameter1: String strOne Parameter2: String strTwo
 * 
 * Test Data: isEqual (“sdet”, “SDET”) ----- FALSE isEqual (“testing”,
 * “testing”) ----- TRUE isEqual (“java”, “java”) ----- TRUE isEqual (“java”,
 * “java Programming”) ----- FALSE
 * 
 * 
 */