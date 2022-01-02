package day8;

public class Day8Homework3 {

	
	public static void main (String [] args) {
		
		int evenTotal = 0;
		
		int oddTotal = 0;
		
		for (int i = 1; i <= 20; i++) {
			
			if (i % 2 ==0) {
				evenTotal = evenTotal + i;
			} else {
				
				//odd
				oddTotal = oddTotal + i;
			}
			
			
		}
		System.out.println("Even Total: " + evenTotal);
		System.out.println("Odd Total: " + oddTotal);
		
	}

}


