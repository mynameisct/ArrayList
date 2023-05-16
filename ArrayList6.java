// Write a Java program to remove the third element in a array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList6 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("+91");
		list.add("75");
		list.add("58");
		list.add("99");
		list.add("38");
		list.add("08");
		list.add("56");
		
		System.out.println("Before Changes: ");
		
		for(String el : list) {
			System.out.println(el);
		}
		
		list.remove(3);
		
		System.out.println("\nAfter Changes: ");
		
		for(String element : list) {
			System.out.println(element);
		}
	}
}
