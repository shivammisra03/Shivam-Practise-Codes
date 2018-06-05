package com.shivam.sorting;

public class ShellSort {
	
	public void sort(int[] A){
		for(int gap=A.length/2;gap>0;gap/=2){
			for(int i=gap;i<A.length;i++){
				int newElement=A[i];
				int j=i;
				while(j>=gap && A[j-gap]>newElement){
					A[j]=A[j-gap];
					j-=gap;
					
				}
				A[j]=newElement;
						
				
			}
			
		}
		
	}

}
