package com.shivam.sorting;

public class MergeSort {
	public void mergeSort(int[] A, int start, int end) {
		if ((end - start) < 2)
			return;
		int mid = (start + end) / 2;
		mergeSort(A, start, mid);
		mergeSort(A, mid, end);
		merge(A, start, mid, end);
		
	}

	private void merge(int[] A, int start, int mid, int end) {
		if(A[mid-1]<A[mid])
			return;
		int i=start,j=mid,tempIndex=0;
		int temp[] = new int[end-start];
		while(i<mid && j<end){
			temp[tempIndex++]=A[i]<A[j]?A[i++]:A[j++];
		}
		System.arraycopy(A, i, A, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, A, start, tempIndex);
	}

}
