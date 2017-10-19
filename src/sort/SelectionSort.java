package sort;

import java.util.Random;

public class SelectionSort {

	public static void selection_sort(int[] a) {
		int j = 0;
		int minIndex;
		int n = a.length;
		
		for (int i = 0; i < n - 1; i++) 
		{
			minIndex = i; // set minimum to location 0
			for (j = i + 1; j < n; j++) // search for the minimum element in the list except i
				// for (j = i + 1; set current elem as the min
			{
				if (a[j] < a[minIndex]) // if the searched element is smaller than the minimum, replace minimum
					// with the searched element
					minIndex = j;
			}
			if (minIndex != i) // if the minimum is different from the element on 0 position, swap the arrays
				swap(a, i, minIndex);	// increment min to the next element
			//swap the minimum element with the current element
			// repeat until the list is sorted
		}
	}

	// searching for lowest index // Your code goes here

	public static void swap(int[] a, int i, int j) {

		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for (i = 0; i < arr.length; i++)
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		// Sort it
		selection_sort(arr);

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}