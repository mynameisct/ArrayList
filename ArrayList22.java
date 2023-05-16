// Write a Java program to print all the elements of a ArrayList using the position of the elements.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList22 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		list.add("60");
		list.add("70");
		
		int no_of_elements = list.size();
		
		for(int index=0; index < no_of_elements; index++) {
			System.out.println(list.get(index));
		}
	}
}
