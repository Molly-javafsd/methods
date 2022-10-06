package com.simplilearn.methods;

import java.util.Scanner;

public class AvgMethod_02 {
	static double avg(int x,int y, int z) {
		return((x+y+z)/3);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int c = sc.nextInt();
		double d=avg(a,b,c);
		System.out.println("Average is: "+d);
		sc.close();
	}
}
