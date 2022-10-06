package com.simplilearn.arrays;

import java.util.Scanner;
public class EquateSumToGivenElement_07 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n= sc.nextInt();
		int []arr1=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter value at "+i+" index:");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Array is: ");
		for(int q:arr1) {
			System.out.print(q+" ");
		}
		System.out.println();
		
		int m=25;
		for(int a=0;a<arr1.length;a++) {
			for(int b=a+1;b<arr1.length;b++) {
				if(arr1[a]+arr1[b]==m)
					System.out.println("Required pair is: "+arr1[a]+" "+arr1[b]);
			}
		}
		sc.close();
	}

}
