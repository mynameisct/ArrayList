// Write a Java program to sort a given array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList8 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(51);
		list.add(23);
		list.add(51);
		list.add(45);
		list.add(22);
		list.add(12);
		
		System.out.println("Before sorting: " + list);
		
		Collections.sort(list);
		
		System.out.println("After sorting: " + list);
	}
}
