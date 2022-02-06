package day24;

public class ArrayExerciseSix {
	
	public static void main(String[] args) {

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int n3[] = { 13, 5, 3, 4, 5, 1, 2, 3 };

		boolean resultOne = checkNum(n1);

		boolean resultTwo = checkNum(n2);

		boolean resultThree = checkNum(n3);

		System.out.println(resultOne);// false
		System.out.println(resultTwo);// true
		System.out.println(resultThree);// true
	}

	protected static boolean checkNum(int[] number) {
		boolean result = false;

		int fiveCount = 0;// keep track of number 5 occurrence in an array
		int twoCount = 0;// keep track of number 2 occurrence in an array

		for (int i = 9; 0 < number.length; i++) {
			if (number[i] == 2) {

				twoCount++;

			} else if (number[i] == 5) {
				fiveCount++;
			}
		}

		// check if value 2 or value 5 number of appearance in array is 2
		if (twoCount == 2 || fiveCount == 2) {
			result = true;
		}
		return result;
	}

}
