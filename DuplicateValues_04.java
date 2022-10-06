package com.simplilearn.arrays;

public class DuplicateValues_04 {

	public static void main(String[] args) {
		int arr[]= {22,45,67,32,88,78,22,67,88};
		
		 for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  //checks from 2nd(j=i+1) value to 1st value(i) in arr
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }		
		 }
	}
}
