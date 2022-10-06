package com.simplilearn.methods;

import java.util.Scanner;
public class MiddleNumber_03 {
	static void evenodd(String s) {
		int l= s.length();
		if(l%2==0) {
			String mid=s.substring(((l/2)-1),((l/2)+1));
			System.out.println("Middle string of length even number is: "+mid);
			}
		else if(l%2!=0) {
			String m1=s.substring((l/2), ((l/2)+1));
			System.out.println("Middle string  of length odd number is: "+m1);
		}
		else
			System.out.println("error");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		String a=sc.next();
		evenodd(a);
		sc.close();
	}
}
