package com.capgemini.lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		
		//stream can be created with static data
		Stream<String> stream = Stream.of("I","G","A","T","E","\n");	
		stream.forEach((location)->System.out.print(" : "+location));
		//stream can be acquired from array or collections
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		stream = locations.stream();
		stream.forEach(System.out::println);
		
		///
		Stream<Integer> str1=Stream.of(10,20,30,40);
		str1.forEach(System.out::println);
		
		Integer values[]=new Integer[] {100,200,300};
		Stream<Integer> arrstr=Arrays.stream(values);
		arrstr.forEach(System.out::println);
	}
}
