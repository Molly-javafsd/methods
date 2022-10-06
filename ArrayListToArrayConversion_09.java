package com.simplilearn.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayConversion_09 {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(54);
	list.add(56);
	list.add(72);
	list.add(98);
	list.add(48);
	
	System.out.println("Arraylist: "+list);
	
	Integer arr[]=new Integer[list.size()];
	arr=list.toArray(arr);													//format used to convert arraylist to array---->       arr=list.Toarray(arr)
	System.out.println("Array: "+Arrays.toString(arr));		//print array using arrays.Tostring
	
	
	
	}
}
