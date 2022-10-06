package com.simplilearn.arrays;

import java.util.Arrays;

public class FindMissing_10 {

	public static void main(String[] args) {
		int arr[]= {2,5,4,3,8,1,10,6,9};
		Arrays.sort(arr);
		boolean flag=false;
		int num=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]+1!=arr[i+1]){
				flag=true;
				num=arr[i]+1;
				break;
			}
		}
		if(flag) {
			System.out.println("Missing number is: " +num);
		}
		else
			System.out.println("No number is missing");
	}

}
