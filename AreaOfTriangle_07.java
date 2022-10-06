package com.simplilearn.methods;

import java.util.Scanner;

public class AreaOfTriangle_07 {
static double area(double b, double h) {
return (0.5*b*h);
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Breadth: ");
		double a=sc.nextDouble();
		System.out.println("Enter Height: ");
		double b=sc.nextDouble();
		double d = area(a,b);
		System.out.println("Area of triangle is: "+d);
		sc.close();
	}
}
