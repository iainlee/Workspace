package com.qa.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
	
		ArrayList<String> catList= new ArrayList<String>();
		
		catList.add("Clawdia");
		catList.add("JK Meowling");
		catList.add("Cat Damon");
		
		List<String> streamedCats = catList.stream().map(cat->cat.toUpperCase())
				.peek(cat->System.out.println(cat))
				.filter(cat -> !cat.equals("CLAWDIA"))
				.peek(byeClawdia -> System.out.println(byeClawdia))
				.collect(Collectors.toList());
		
		System.out.println(catList);
		System.out.println(streamedCats);
	}

}