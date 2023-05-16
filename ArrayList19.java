// Write a Java program to trim the capacity of an array list to the current list size.

package com.collection.framework;

import java.util.ArrayList;

public class ArrayList19 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
	
		al.size();
		
		System.out.println(al.size());
		
		al.trimToSize();
		
		System.out.println(al);
	}

}
