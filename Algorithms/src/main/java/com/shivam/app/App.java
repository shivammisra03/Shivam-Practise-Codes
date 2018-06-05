package com.shivam.app;

import com.shivam.sorting.BubbleSort;
import com.shivam.sorting.CountingSort;
import com.shivam.sorting.InsertionSort;
import com.shivam.sorting.MergeSort;
import com.shivam.sorting.QuickSort;
import com.shivam.sorting.RadixSort;
import com.shivam.sorting.SelectionSort;
import com.shivam.sorting.ShellSort;

public class App {

	public static void main(String[] args) {
		int[] A= {1212,1206,1201,1247,1235};
		
//		BubbleSort bubbleSort = new BubbleSort();
//		bubbleSort.sort(A);
		
//		SelectionSort selectionSort = new SelectionSort();
//		selectionSort.sort(A);
		
//		InsertionSort insertionSort = new InsertionSort();
//		insertionSort.sort(A);
		
//		MergeSort mergeSort = new MergeSort();
//		mergeSort.mergeSort(A, 0, A.length);
		
//		QuickSort quickSort = new QuickSort();
//		quickSort.quicksort(A, 0, A.length);
		
//		ShellSort shellSort = new ShellSort();
//		shellSort.sort(A);
		
//		CountingSort countingSort = new CountingSort();
//		countingSort.counting(A, 2, 10);
		
		RadixSort radixSort = new RadixSort();
		radixSort.radixSort(A, 10, 4);
				
		App app = new App();
		app.display(A);
		
		
		
	}
	public void display(int[] A){
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+"\t");
		}
		
	}

}
