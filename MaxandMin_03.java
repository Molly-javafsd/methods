package com.simplilearn.arrays;

import java.util.Arrays;

public class MaxandMin_03 {

	public static void main(String[] args) {
		int arr[]= {45,78,99,76,56,102};
		Arrays.sort(arr);
		System.out.println("Sorted array: "+Arrays.toString(arr));
		System.out.println("Maximum element is: "+arr[arr.length-1]);
		System.out.println("Minimum element is: "+arr[0]);
		
		
		
	}

}
