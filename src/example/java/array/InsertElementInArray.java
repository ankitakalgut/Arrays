package example.java.array;

/**
 * @author akalgutk 
 * Insert an element 100 at position 3 and print the elements of the array
 * Note:this class will insert an element based on position and not index position
 */

public class InsertElementInArray {

	public static void main(String args[]) {
		int[] a = { 10, 20, 30, 40, 50 };
		int position = 3;
		int element=100;
		// Insert an element 100 at position 3
		for (int i = a.length - 1; i >position - 1; i--) {
			a[i] = a[i - 1];
		}
		a[position-1] = element;

		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
