package com.simplilearn.methods;
import java.util.Scanner;

public class SmallestOf3_01 {
	static int method(int a,int b,int c) {
		if(a<b && a<c)
			return a;
		else if(b<a && b<c)
			return b;
		else
			return c;
	}
	static void smaller(int q,int r,int s) {
		if(q<r && q<s)
			System.out.println(q+" is smallest");
		else if(r<q && r<s)
			System.out.println(r+" is smallest");
		else
			System.out.println(s+" is smallest");
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 1st number: ");
	int x = sc.nextInt();
	System.out.println("Enter 2nd number: ");
	int y = sc.nextInt();
	System.out.println("Enter 3rd number: ");
	int z = sc.nextInt();
	int d=method(x,y,z);
	System.out.println("Smallest among them is: "+d);
	smaller(x,y,z);
	sc.close();
	}
}
