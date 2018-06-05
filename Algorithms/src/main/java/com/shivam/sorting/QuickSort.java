package com.shivam.sorting;

public class QuickSort {
	
	public void quicksort(int[] A, int start, int end) {
		if(end-start<2) return;
		int pIndex =partition(A,start,end);
		quicksort(A, start, pIndex);
		quicksort(A, pIndex+1, end);

	}

	private int partition(int[] A, int start, int end) {
		int i =start, j=end;
		int pivot=A[start];
		while(i<j){
			while(i<j && A[--j]>=pivot);
			if(i<j){
				A[i]=A[j];
			}
			while(i<j && A[++i]<=pivot);
			if(i<j){
				A[j]=A[i];
			}
		}
		A[i]=pivot;
		return i;
	}

}
