package day11;

public class MonkeyStatus {
	
	public static void main (String [] args) {
		
		boolean areWeInTrouble = monkeyTrouble (true, true);
		boolean areWeInTrouble2 = monkeyTrouble (true, false);
		boolean areWeInTrouble3 = monkeyTrouble (false, false);
		
		System.out.println(areWeInTrouble);
		System.out.println(areWeInTrouble2);
		System.out.println(areWeInTrouble3);
	}

	
	public static boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
		
		boolean result = false;
		
		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false))  {
			result = true;
		} else if ((aSmile == false && bSmile == true) || (aSmile == true && bSmile == false)) {
			result = false;
		}
		return result;
		
	}
}
