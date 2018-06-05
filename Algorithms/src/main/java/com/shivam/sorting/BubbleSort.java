package com.shivam.sorting;

public class BubbleSort {
	
	public void sort(int[] A){
		
		for(int lastUnsortedIndex=A.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
			for(int i= 0;i<lastUnsortedIndex;i++){
				if(A[i]>A[i+1]){
					swap(A, i, i+1);
				}
			}
		}
		display(A);
	}
	public void display(int[] A){
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+"\t");
		}
		
	}
	public void swap(int[] A,int i, int j) {
		int temp = A[i];
		A[i]=A[j];
		A[j]=temp;
	}

}
