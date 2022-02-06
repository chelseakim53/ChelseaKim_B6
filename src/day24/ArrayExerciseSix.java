package day24;

public class ArrayExerciseSix {
	
	public static void main(String[] args) {

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int n3[] = { 13, 5, 3, 4, 5, 1, 2, 3 };
		int n4[] = {2,6,2};

		boolean resultOne = checkNum(n1);

		boolean resultTwo = checkNum(n2);

		boolean resultThree = checkNum(n3);
		
		boolean resultFour = checkNum(n4);

		System.out.println(resultOne);// false
		System.out.println(resultTwo);// true
		System.out.println(resultThree);// true
		System.out.println(resultFour);//true
	}

	protected static boolean checkNum(int[] number) {
		boolean result = false;

		int fiveCount = 0;// keep track of number 5 occurrence in an array
		int twoCount = 0;// keep track of number 2 occurrence in an array

		for (int i = 0; 0 < number.length; i++) {
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

/**
6. Write a method that takes an array of int parameter and return true if the array
contains value 2 twice, or value 5 twice.

Access Modifier: protected
Non-Access Modifier: static
Return Type: boolean
Method Name: checkNum
Parameter1: int [] number
Test Data:
checkNum ([6, 1, 2, 3]) ----- FALSE
checkNum ([13, 2, 3,4, 6, 1, 2, 3]) ----- TRUE
checkNum ([3, 3,0, 1, 4, 3 ,6]) ----- FALSE
checkNum [2, 6, 2]) ----- TRUE
*/