// Write a program to retrieve an element(at a specified index) from a given array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("My");
		list.add("Name");
		list.add("is");
		list.add("Chaitanya");
		list.add("Dnyaneshwar");
		list.add("Tribhuwan");
		
		System.out.println("The elements in given list are: ");
		
		for(String element : list) {
			System.out.println(element);
		}
		
		System.out.println("Element at third index is: " + list.get(3));
		
		System.out.println("Element at fifth index is:  " +list.get(5));
	}
}
