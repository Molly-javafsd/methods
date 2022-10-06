package com.simplilearn.methods;

import java.util.Scanner;

public class LeapYearCheck_06 {
static String meth(int n) {
	if(((n%4==0) && (n%100!=0)) || (n%400==0))
		return "Leap year";
	else
		return "Non leap year";
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year: ");
		int x = sc.nextInt();
		String z=meth(x);
		System.out.println("Entered year is: "+z);
		sc.close();

	}

}
