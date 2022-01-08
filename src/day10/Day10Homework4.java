package day8;

public class Day10Homework4 {
	
	public static void main (String [] args) {
		
	getDoWhileLoopResult (3, 10);
	
	}


	public static void getDoWhileLoopResult (int minNum, int maxNum) {
	
	
	do {
		System.out.println(minNum);
		
		minNum++;
		
	} while (minNum <= maxNum);
}
}