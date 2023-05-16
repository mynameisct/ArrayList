// Write a Java program to search an element in a array list.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList7 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("Chaitanya");
		al.add("Saurabh");
		al.add("Nikhil");
		al.add("Pratik");
		al.add("Sanket");
		
		if(al.contains("Nik"))
			System.out.println("Element do exists");
		else
			System.out.println("No such Element really exists");
		}
}
