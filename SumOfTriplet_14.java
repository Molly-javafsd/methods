package com.simplilearn.arrays;

import java.util.Arrays;

public class SumOfTriplet_14 {

	public static void main(String[] args) {
		int [] arr= {1, -2, 0, 5, -1, -4};
		Arrays.sort(arr);
		int m=2;
		for(int i=0;i<arr.length;i++) 
			for(int j=i+1;j<arr.length;j++) 
			   for(int k=j+1;k<arr.length;k++) 
					if(arr[i]+arr[i+1]+arr[i+2]==m) 
						System.out.println("Required triplets are "+arr[i]+" "+arr[i+1]+" "+arr[i+2]);
	}
}
