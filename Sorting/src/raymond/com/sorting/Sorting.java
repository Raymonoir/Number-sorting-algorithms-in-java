package raymond.com.sorting;

public class Sorting {

	public static void main(String[] args) 
	{
		int [] arr = {9,8,7,6,5,4,3,2,1,1};
		
		BubbleSort bs = new BubbleSort(arr);
		ShuttleSort ss = new ShuttleSort(arr);
		MergeSort ms = new MergeSort(arr);
		int [] arr2 = ms.sort();
		
		printArray(arr2);
		



	}
	
	public static int [] swap (int [] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		return array;
		
	}
	
	public static void printArray (int [] array)
	{
		for (int i : array)
		{
			System.out.print(i + ", ");
		}
		System.out.println();
		
	}

}
