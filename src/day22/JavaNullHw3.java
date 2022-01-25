package day22;

public class JavaNullHw3 {
	
	public static void main (String [] args) {
		
		JavaNullHw3 obj = new JavaNullHw3();
		
		String result1 = obj.threeEqual(null, 'P', 'B');
		String result2 = obj.threeEqual("Java Pro", 'P', 'B');
		String result3 = obj.threeEqual("Lazy mode", 'm', 'C');
		String result4 = obj.threeEqual("Training", 'T', ' ');
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	
	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = "";
		if (str != null) {
			result = str.replace(oldChar, newChar);
		} else if (str == null) {
			result = null;
		}
		
		return result;
	}

}

/**
3. Write a method that takes three parameters. One String parameter, 2 character
parameters. The method replaces old character (parameter 2) from String parameter
with new character (parameter 3) and returns the new string

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar
Test Data:
threeEqual (null, ’P’, ‘B‘) ----- null
threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining
*/