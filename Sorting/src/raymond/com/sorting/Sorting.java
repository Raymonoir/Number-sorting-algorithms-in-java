package raymond.com.sorting;


/**
 * This class contains basic methods that will be required by most sorting algorithms such as
 * swapping elements of an integer array as well as outputting the array to the console.
 * 
 * 
 * @author Raymond Ward
 * @Version 02/02/2019
 *
 */

public class Sorting {

	public static void main(String[] args) 
	{
		int [] arr = {234,765,987,123,657,897,567,858,345,232,456,787,908,234,120,562};
		
		BubbleSort bs = new BubbleSort(arr);
		ShuttleSort ss = new ShuttleSort(arr);
		MergeSort ms = new MergeSort(arr);
		InsertionSort is = new InsertionSort(arr);
		is.sort();

		



	}
	
	/**
	 * 
	 * @param array the array in which the elements to be swapped are contained
	 * @param index1 the index of the first element to be swapped
	 * @param index2 the index of the second element to be swapped
	 * @return array with the swapped elements
	 */
	
	public static int [] swap (int [] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		return array;
		
	}
	
	/**
	 * Outputs array to the console
	 * @param array the array to be printed
	 */
	
	public static void printArray (int [] array)
	{
		for (int i : array)
		{
			System.out.print(i + ", ");
		}
		System.out.println();
		
	}

}
