package sorting;

import java.util.Arrays;

public class ArraySort
{

	public static int[] bubbleSort(int[] arr)
	{
		int temp;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					// arr = swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					swap(arr[i], arr[j]);
				}
			}
		}
		return arr;
	}

	private static void swap(int i, int j)
	{
		int temp;
		temp = i;
		i = j;
		j = temp;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] arrToSort = { 7, 8, 2, 3, 6, 5, 4, 0, 9, 1 };

		System.out.println(Arrays.toString(ArraySort.bubbleSort(arrToSort)));

	}

}
