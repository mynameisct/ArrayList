// Write a Java Program to copy one array list into another.

package com.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList9 {

	public static void main(String[] args) {
	
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		System.out.println("Before : Arraylist 1 is as: " + list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		
		System.out.println("Before: Arraylist 2 is as: " + list2);
		
		// copy ArrayList 2 to ArrayList 1
		Collections.copy(list1,list2);
		
		System.out.println("After: Arraylist 1 is" + list1);
		System.out.println("After: ArrayList 2 is "+ list2);
	}

}
