package example.java.array;

/**
 * @author akalgutk 
 * 
 * This class is used to print the elements of 1D Array.
 */

public class Print1DArray {

	public static void main(String args[]) {

		// Declare an Initialize an array;
		int[] a = { 10, 20, 30, 40, 50 };

		// Print elements of an array using for loop
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println();

		// Print using foreach loop
		for (int i : a) {
			System.out.print(i + " ");
		}

	}
}
