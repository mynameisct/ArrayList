// Write a Java program of swap two elements in an array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList14 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("D");
		
		System.out.println("Before Swapping: " + list);
		
		Collections.swap(list, 1, 2);
		
		System.out.println("After Swapping: " + list);
	}
}
