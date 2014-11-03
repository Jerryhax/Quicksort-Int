
public class QDemoInt
	{
	static int a[] = {4, 8, 1, 3, 0, 2, 8, 8, 9 ,5, 3};
	
	public static void main (String args[])
		{
		System.out.println("Original array: ");
		displayArray();
		QuicksortInt.qsort(a);
		System.out.println();
		System.out.println("\nSorted array: ");
		displayArray();
		}
	
	public static void displayArray()
		{
		for (int fred : a)
			{
			System.out.print(fred);
			}
		}
		
	}
	
