package day19;

public class HwQuestion4 {
	public static void main (String [] args) {
	
	HwQuestion4 obj1 = new HwQuestion4();
	String s1 = obj1.toUpper("Pro");
	
	HwQuestion4 obj2 = new HwQuestion4();
	String s2 = obj2.toUpper("java");
	
	HwQuestion4 obj3 = new HwQuestion4();
	String s3 = obj3.toUpper("java training");
	
	}
	
	 String toUpper(String strOne) {
		String Myresult = "";
	
		String result = strOne.toUpperCase();
			System.out.println(result);
		
			return Myresult;
	}

}


/**
4. Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (“java training”) ----- JAVA TRAINING
*/