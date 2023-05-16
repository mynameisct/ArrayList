// Write a Java program to extract a portion of a array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList12 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		
		System.out.println("Real ArrayList: " + al);
		
		List<String> list = al.subList(1, 4);
		
		System.out.println("Selected Portion of ArrayList: " + list);
	}

}
