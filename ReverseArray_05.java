package com.simplilearn.arrays;

import java.util.Arrays;

public class ReverseArray_05 {

	public static void main(String[] args) {
		int arr[]= {22,45,67,32,88,78};
		int n=Math.floorDiv(arr.length, 2); //Math.floorDiv return biggest integer
		int l=arr.length;
		int temp;
		for(int i=0;i<n;i++) {
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
			}
		System.out.println(Arrays.toString(arr));
	
	}

}
