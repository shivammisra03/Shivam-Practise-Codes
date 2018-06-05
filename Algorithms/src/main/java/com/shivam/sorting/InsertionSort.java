package com.shivam.sorting;

public class InsertionSort {
	
	public void sort(int[] A) {
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<A.length;firstUnsortedIndex++){
			int j;
			int element =A[firstUnsortedIndex];
			for(j=firstUnsortedIndex;j>0 && A[j-1]>element;j--){
				A[j]=A[j-1];
			}
			A[j]=element;
		}
		
		display(A);
	}
	
	public void display(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "\t");
			
		}

	}

	

}
