package com.simplilearn.arrays;

public class CheckElements_12 {
		// if 0 or -1 is present is array
	public static void main(String[] args) {
	int arr[]= {2,3,5,6,8,1,7};
	boolean flag=false;
	for(int e:arr) {
		if(e==0 || e==-1) {
			flag=true;
			break;
		}
		}
	if(flag) {
		System.out.println("0 or -1 present");
	}
	else
		System.out.println("0 or -1 not present");
	}

}
