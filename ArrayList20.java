// Write a Java program to increase the size of an array list.

package com.collection.framework;

import java.util.ArrayList;

public class ArrayList20 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("Original ArrayList: " + list);
		
		list.ensureCapacity(6);
		list.add("D");
		list.add("E");
		list.add("F");
		
		System.out.println("New ArrayLiist: "+list);

	}

}
