package com.capgemini.lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {
		
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		Stream<String> stream = locations.stream();
		List<String> result = stream.
				filter((location)->location.length()>3).
				collect(Collectors.toList());
		result.stream().forEach((city)->System.out.println(city));
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		System.out.println("=======================");
		listint.stream().distinct().forEach(arg->System.out.println(arg));
		System.out.println("=======================");
		listint.stream().limit(3).forEach(arg->System.out.println(arg));
		System.out.println("=======================");
		listint.stream().filter(arg->arg>10).forEach(arg->System.out.println(arg));
		System.out.println("=======================");
		long c=listint.stream().count();
		System.out.println(c);
		System.out.println("=======================");
		int sum1=listint.stream().collect(Collectors.summingInt(i->i));
		System.out.println("Sum is: "+sum1);
		System.out.println("=======================");
		Optional<Integer> opres=listint.stream().reduce((a,b)->a+b);
		int sum2=opres.get();
		System.out.println("Sum is: "+sum2);
		System.out.println("=======================");
		listint.stream().sorted().forEach(System.out::println);;
		
		
	}
}
 