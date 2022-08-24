package demo;

import java.util.ArrayList;
import java.util.List;

public class JavaBasic_DS {

	public static void main(String[] args) {

		System.out.println("Java DS");
		System.out.println("Linear Data Types");

		System.out.println("Continoius Memory Allocation");
		System.out.println("Array");

		int[] intArray = new int[5];

		int[][] intArray2D = new int[5][5];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 2;

		}

		for (int i = 0; i < intArray2D.length; i++) {
			for (int j = 0; j < intArray2D[i].length; j++) {
				intArray2D[i][j] = i * 2;
			}
		}

		/*
		 * for(int i=0;i<intArray.length;i++) { System.out.println(intArray[i] );
		 * 
		 * }
		 */

		/*
		 * for(int arrayObject : intArray) { System.out.println(arrayObject);
		 * 
		 * }
		 * 
		 * int i =0 ; while( i<intArray.length ) {
		 * 
		 * System.out.println(intArray[i]); i++; }
		 * 
		 * int j =0; do {
		 * 
		 * System.out.println(intArray[j]); j++;
		 * 
		 * } while (j<intArray.length);
		 */

		// displayArray(new int[] { 1, 2, 3, 4 });

		displayArray(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });

		System.out.println("Non Continoius Memory Allocation");
		System.out.println("LinkedList");

		var StringList = new ArrayList<String>();

		String valueToBeAdded = "";

		String valueToBeChecked = "";
		StringList.add(valueToBeAdded);

		StringList.remove(1);

		if (StringList.contains(valueToBeChecked)) {
			System.out.println( StringList.indexOf(valueToBeChecked));
			System.out.println("Value Found");
		}
		

		/*
		 * 
		 * 
		 * 
		 * System.out.println("Non-Linear Data Types");
		 * 
		 * 
		 * 
		 * System.out.println("Map");
		 * 
		 * System.out.println("Set");
		 * 
		 * System.out.println("Graph");
		 * 
		 * System.out.println("Trees");
		 */

	}

	private static void displayArray(int[][] is) {
		for (int[] arrayRow : is) {

			for (int arrayObject : arrayRow) {

				System.out.println(arrayObject);

			}
			System.out.println("\n");

		}
		// TODO Auto-generated method stub

	}

	private static void displayArray(int[] is) {
		// TODO Auto-generated method stub
		for (int arrayObject : is) {
			System.out.println(arrayObject);

		}

	}

}
