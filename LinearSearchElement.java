package com.simplilearn.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element to be searched:");
	int a=sc.nextInt();
	int [] ar= {2,7,9,4,3,1,67,99};
	Arrays.sort(ar);
	System.out.println("Required array is: ");
	for(int q:ar) {
		System.out.println(q);
	}
	int flag=0;
	int position=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==a) {
			flag=1;
			position=i;
			break;
		}
		else
			flag=0;
	}
	if(flag==1) {
		System.out.println("Element is found at "+position+" position.");
	}
	else
		System.out.println("Element absent");
	sc.close();
}
}
