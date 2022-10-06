package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityTest_08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st integer array: ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+"th element");
			arr1[i]=sc.nextInt();
		}
		

		System.out.println("Enter the size of 2nd integer array: ");
		int n1=sc.nextInt();
		int arr2[]=new int[n];
		for(int i=0;i<n1;i++) {
			System.out.println("Enter "+i+"th element");
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("1st array: "+Arrays.toString(arr1));
		System.out.println("2nd array: "+Arrays.toString(arr2));
		if (Arrays.equals(arr1, arr2)){       			// Arrays.equals(Array1,Array2)===used to check whether 2arrays are equal or not
			System.out.println("Both the Arrays are equal");
		}
		else
			System.out.println("Arrays are not equal");
		sc.close();
	}

}
