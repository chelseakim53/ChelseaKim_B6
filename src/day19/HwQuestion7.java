package day19;

public class HwQuestion7 {
	
	public static void main (String [] args) {//static to nonstatic needs obj creation
		
		HwQuestion7 obj1 = new HwQuestion7();
		String name1 = obj1.helloTo("Denis");
		
		HwQuestion7 obj2 = new HwQuestion7();
		String name2 = obj2.helloTo("Malek");
		
		HwQuestion7 obj3 = new HwQuestion7();
		String name3 = obj3.helloTo("Sara");
		
		
	}
	String helloTo(String strOne) {
		String Myresult = "";
				
		String result = "Hello ".concat(strOne);
		System.out.println(result);
				
		return Myresult;
		
	}
}

/**
7. Write a method that takes one String parameter (name) and the method returns new
String value appending “Hello” to name parameter

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: helloTo
Parameter1: String strOne
Test Data:
helloTo (“Denis”) ----- Hello Denis
helloTo (“Malek”) ----- Hello Malek
helloTo (“Sara”) ----- Hello Sara
*/