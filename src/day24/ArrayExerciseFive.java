package day24;


public class ArrayExerciseFive {
	
	public static void main (String [] args) {

		ArrayExerciseFive obj = new ArrayExerciseFive();

		int n1[] = { 6, 1, 2, 3 };
		

		int resultOne [] = obj.getDouble(n1);

		for(int i = 0;i<resultOne.length;i++)  {
			System.out.println(resultOne[i]);
		}
		
		}

	private int [] getDouble (int [] number) {
		int [] result = new int [number.length*2];

		int lastIndex = result.length-1;
		int lastElement = number[number.length-1];
		
		result [lastIndex] = lastElement;
		
		
		return result;
	}
	
}
		

/**
5. Write a method that takes an array of int parameter and return a new array with double
the size/length, where its last element value is the same as the original array last
element, and all the other element values are 0.

Access Modifier: private
Non-Access Modifier: non-static
Return Type: int []
Method Name: getDouble
Parameter1: int [] number
Test Data:
getDouble ([6, 1, 2, 3]) ----- [0,0,0,0,0,0,0,3]
getDouble ([13, 3]) ----- [0,0,0, 3]
getDouble ([0, 1, 4]) ----- [0,0,0,0,0,4]
getDouble ([ 6]) ----- [0,6]
*/