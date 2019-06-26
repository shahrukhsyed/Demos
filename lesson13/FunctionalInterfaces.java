package com.capgemini.lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		Consumer<String> consumer = (String str)-> System.out.println(str);
		consumer.accept("Hello LE!");
		Supplier<String> supplier = () -> "Hello from Supplier!";
		consumer.accept(supplier.get());
		BiConsumer<String,Double> bis=(en,sal)->System.out.println(en+" has salary Rs."+sal);
		bis.accept("Ram", 50000.0);
		
		Supplier <List<String>> isup=()->Arrays.asList("Ram","ankish","akshat");
		List<String> is=isup.get();
		System.out.println(is);
		
		BiPredicate<String, Integer> bipd=(user,age)->user.equals("Ram")&&age>=18;
		System.out.println(bipd.test("Ram", 20));
		
		Function<String, Integer>  fn1=(str)->str.length();
		int result1=fn1.apply("Welcome to Cap Gemini");
		System.out.println(result1);
		
		UnaryOperator<String> fn2=(str)->str.substring(4);
		String s=fn2.apply("Cap Gemini");
		System.out.println(s);
		
		//even number test
		Predicate<Integer> predicate = num -> num%2==0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(15));
		//max or min test
		BiFunction<Integer, Integer, Integer> maxFunction = (x,y)->x>y?x:y;
		System.out.println(maxFunction.apply(25, 14));
		//bill                                                                   
		BiFunction<Item, Integer, Double> billfn=(item,quantity)->item.getPrice()*quantity;
		double bill=billfn.apply(new Item("Pen",100.00), 2);
		System.out.println(bill);
		
	}
}
