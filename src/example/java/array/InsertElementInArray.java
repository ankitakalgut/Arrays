package example.java.array;

/**
<<<<<<< HEAD
 * @author akalgutk-Ankita Kalgutkar 
 * Insert an element 100 at position 3 and print the elements of the array
 * Note:this class will insert an element based on position and not index position.
=======
 * @author akalgutk 
 * Insert an element 100 at position 3 and print the elements of the array using foreachloop
 * Note:this class will insert an element based on position and not index position
>>>>>>> c6632ae69d35d2f9e4059f5830cbc29768fea39a
 */

public class InsertElementInArray {

	public static void main(String args[]) {
		int[] a = { 10, 20, 30, 40, 50 };
		int position = 3;
		int element=100;
		// Insert an element 100 at position 3 of an array
		//Print the array
		for (int i = a.length - 1; i >position - 1; i--) {
			a[i] = a[i - 1];
		}
		a[position-1] = element;

		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
