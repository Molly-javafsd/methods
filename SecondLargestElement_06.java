package com.simplilearn.arrays;

import java.util.Arrays;

public class SecondLargestElement_06 {

	public static void main(String[] args) {
		int arr[]= {45,78,99,76,56,102};
		Arrays.sort(arr);
		
		//for 2nd max and min value
				int n=2;
				
				System.out.println("2nd max element is: "+arr[arr.length-n]);
				System.out.println("2nd min element is: "+arr[n-1]);

	}

}
