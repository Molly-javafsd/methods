package com.simplilearn.methods;

import java.util.Scanner;

public class SumOfDigits_05 {
	static int sum(int n) {
		int sum1=0;
		while(n!=0) {
			sum1=sum1+(n%10);
			n=(n/10);
		}
		return sum1;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 1st number: ");
	int a = sc.nextInt();
	int d=sum(a);
	System.out.println("Sum of digits is: "+d);
	sc.close();
}
}
