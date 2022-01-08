package day11;

public class SleepStatus {
	
	public static void main (String [] args) {
		
	boolean amIsleeping = sleepIn(false, false); //system.out.println(sleepIn(false, false)); <-- shortcut
	boolean amIsleeping2 = sleepIn (true, false);
	boolean amIsleeping3 = sleepIn (false, true);
	boolean amIsleeping4 = sleepIn (true, true);
		
	System.out.println(amIsleeping);
	System.out.println(amIsleeping2);
	System.out.println(amIsleeping3);
	System.out.println(amIsleeping4);
		
		}
		
		
	
	public static boolean sleepIn (boolean isWeekday, boolean isVacation) {
		
		boolean result = false;
		
		if (isWeekday == true && isVacation == false) {
			result = false;
		}
		else if ((isWeekday == false && isVacation == true) || (isWeekday == false && isVacation == false)) {
			result = true;
		} 
		else if (isWeekday == true &&  isVacation == true) {
			result = false;
		
		}
		return result;
		
		
	}
}
