package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNStringSort_01 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of integer array: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter "+i+"th element");
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the size of string array: ");
	int n1=sc.nextInt();
	String name[]=new String[n1];
	for(int j=0;j<n1;j++) {
		System.out.println("Enter "+j+"th element");
		name[j]=sc.next();
	}
	
	
	System.out.println("Original integer array: ");
	System.out.println(Arrays.toString(arr));
	
	Arrays.sort(arr);   															//arrays.sort to sort
	System.out.println("Sorted integer array: ");
	System.out.println(Arrays.toString(arr));    						 //arrays.Tostring to print array

	System.out.println("Original String array:");
	System.out.println(Arrays.toString(name));
	
	Arrays.sort(name);
	System.out.println("Sorted String array:");
	System.out.println(Arrays.toString(name));
	sc.close();
}

}
