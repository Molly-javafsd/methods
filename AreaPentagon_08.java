package com.simplilearn.methods;

import java.util.Scanner;

public class AreaPentagon_08 {
static double area(double p,double a) {
	return ((p*a)*0.5);
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter perimeter: ");
		double a=sc.nextDouble();
		System.out.println("Enter apothem: ");
		double b=sc.nextDouble();
		double d = area(a,b);
		System.out.println("Area is: "+d);
		sc.close();
	}
}
