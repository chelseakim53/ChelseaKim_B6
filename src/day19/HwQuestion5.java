package day19;

public class HwQuestion5 {
	
	public static void main (String [] args) {//static to nonstatic needs obj creation
		
		HwQuestion5 obj1 = new HwQuestion5();
		String resultOne = obj1.toLower("espn");
		
		HwQuestion5 obj2 = new HwQuestion5();
		String resultTwo = obj2.toLower ("SOCCER");
		
		HwQuestion5 obj3 = new HwQuestion5();
		String resultThree = obj3.toLower ("STRING CLASS");
		
	}
	
		protected String toLower(String strOne) {
			String Myresult = "";
			
			String result = strOne.toLowerCase();
				System.out.println(result);
				
			
			return Myresult;
			
			
		}
	}
	


/**
5. Write a method that takes one String parameter and the method converts the
parameter to lowercase and return the new String value

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: toLower
Parameter1: String strOne
Test Data:
toLower (“espn”) ----- espn
toLower (“SOCCER”) ----- soccer
toLower (“STRING CLASS”) ----- string class
*/