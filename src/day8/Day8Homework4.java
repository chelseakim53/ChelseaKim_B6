package day8;

public class Day8Homework4 {

	public static void main (String [] args) {
		int evenTotal = 0;
		
		int oddTotal = 0;
		
		int count = 1;

		
		while (count <= 20) {
			if (count % 2 ==0) {
				evenTotal = evenTotal + count;
			} else {
				oddTotal = oddTotal + count;
			}
			
			count++;
		}
		System.out.println("WHILE Even Total: " + evenTotal);
		System.out.println("WHILE Odd Total: " + oddTotal);
	}

}

	

