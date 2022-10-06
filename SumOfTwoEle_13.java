package com.simplilearn.arrays;

public class SumOfTwoEle_13 {

	public static void main(String[] args) {
		int [] arr= {1,2,4,5,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==6) {
					System.out.println("Required pair is "+arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
