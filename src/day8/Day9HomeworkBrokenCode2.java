package day8;

public class Day9HomeworkBrokenCode2 {
	
	public static void main(String[] args) { //correct the order and capitalize s in string 
		double tempOne=84.7; //change int to double because of decimals
		 int tempTwo =66;
		
		String temp = "result"; {
			System.out.println(temp);
		}
		if (tempOne <= 0 && tempTwo >= 100) { // remove extra & sign, remove spaces and change order so that greater/lesser than sign comes before = sign.
			System.out.println("result: true");
		}  else if (tempOne >= 100 && tempTwo <= 0) { //switch order of < and =
			System.out.println("result: true"); // change to correct syntax so that the results print
		} else {
			System.out.println("result: false");
		}
		
		System.out.println("result");
		
		String season = "Monday";

		switch (season) {
		case "fall":
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 
		case "spring":
			System.out.println("Recovering from cold weather");			
			break;
		case "summer": // change ; to :
			System.out.println("Toooo hot");			
			 
		default: //change ; to :
			System.out.println("Season does not exist!");	
		}
		
		
		
		for(int i = 1; i <10; i++) { //initialize i, change , to ;
			
			if (i == 5) { //remove ;
				System.out.println("i equals to 5");
			} else {
				System.out.println("i not equals");
			}
		}
		
	}
	
	
 
//remove extra }
}




