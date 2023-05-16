// Write a Java program to shuffle elements in a array list

package com.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList10 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("23");
		list.add("45");
		list.add("12");
		list.add("34");
		list.add("56");
		list.add("178");
		list.add("2223");
		
		System.out.println("Before shuffle: " + list);
		
		Collections.shuffle(list);
	
		System.out.println("After shuffle: " + list);

	}

}
