package com.shivam.sorting;

public class SelectionSort {

	public void sort(int[] A) {
		for (int lastUnsortedIndex = A.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if(A[largest]<A[i])	largest=i;
				
			}
			swap(A, lastUnsortedIndex, largest);
		}
		display(A);
	}

	public void display(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "\t");
		}

	}

	public void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
