package example.java.array;

/**
 * @author akalgutk
 *
 *This class is used to print the elements of 2D Array.
 */
public class Print2DArray {
	
	public static void main(String args[])
	{
		int[][] a= {{1,2,3,4},{1,5,6}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}

}
