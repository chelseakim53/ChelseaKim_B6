package day8;

public class Day10Homework2 {
	
	public static void main (String [] args) {
		
		getGender ('F');
		
	}
	
	public static void getGender (char gender) {
		
		if (gender == 'm') {
			System.out.println("Male");
		}
		else if (gender == 'M') {
			System.out.println("Male");
		}
		else if (gender == 'f') {
			System.out.println("Female");
		}
		else if (gender == 'F') {
			System.out.println("Female");
		}
		
	}

}
