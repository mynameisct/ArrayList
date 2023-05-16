// Write a Java program to update specific array element by given element.

package com.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Kesariya");
		list.add("Ishq");
		list.add("Hai Piya..");
		
		System.out.println("Before changes:");
		
		for(String e : list) {
			System.out.println(e);
		}
		
		list.set(1,"Tera Ishq");
		
		System.out.println("\nAfter Changes");
		
		for(String element : list) {
			System.out.println(element);
		}

	}

}
