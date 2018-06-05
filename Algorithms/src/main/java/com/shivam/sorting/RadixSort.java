package com.shivam.sorting;

public class RadixSort {
	
	//for radix sort width should be same
	public void radixSort(int[] A, int radix, int width){
		for(int i=0;i<width;i++){
			radixSingleSort(A, i, radix);
		}
		
	}
	public void radixSingleSort(int[] A, int position, int radix){
		int tempArray[] = new int[A.length];
		int[] countArray= new int[radix];
		//original count array
		for(int i=0;i<A.length;i++){
			countArray[getIndex(A[i], position, radix)]++;
		}
		//cumulative count
		for (int i=1;i<radix;i++){
			countArray[i]+=countArray[i-1];
		}
		for(int i=A.length-1;i>=0;i--){
			tempArray[--countArray[getIndex(A[i], position, radix)]]=A[i];
		}
		for (int i = 0; i < tempArray.length; i++) {
            A[i]=tempArray[i];

        }
		
		
	}
	
	int getIndex(int value, int position, int radix){
		return value/(int)Math.pow(10, position)%radix;
		
	}

}
