package com.shivam.sorting;

public class CountingSort {
	public void counting(int[] A, int min, int max) {
		int[] count = new int[max - min + 1];

		for (int i = 0; i < A.length; i++) {
			count[A[i]-min]++; 
		}
		int j=0;
		for (int i = min; i <= max; i++) {
			while(count[i-min]>0){
				A[j++]=i;
				count[i-min]--;
			}
		}

	}

}
