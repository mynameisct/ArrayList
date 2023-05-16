// Write a Java Program to reverse elements in a array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList11 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("11");
		list.add("22");
		list.add("33");
		list.add("44");
		list.add("55");
		
		System.out.println("Real order of elements: " + list);
		
		Collections.reverse(list);
		
		System.out.println("Reverse order of elements: " + list);

	}

}
