package com.simplilearn.arrays;

public class AverageOfArrayElements_02 {

	public static void main(String[] args) {
		int arr[]= {45,78,99,76,56,102};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		double avg=(sum/arr.length);
		System.out.println("Average of elements is: "+avg);
		
	}

}
