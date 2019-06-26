package com.capgemini.lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Mapping {

	public static void main(String[] args) {
		
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		System.out.println("Word legnth for locations:");
		locations.stream().map(String::length).forEach(System.out::print);
		
		System.out.println("\n====================");
		List<Integer> lenlist=locations.stream().map(str->str.length())
				.collect(Collectors.toList());
		lenlist.forEach(System.out::println);
	}
}
