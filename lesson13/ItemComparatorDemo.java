package com.capgemini.lesson13;

import java.util.Arrays;
import java.util.Comparator;

public class ItemComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item it[]= {new Item("PC",34000.00),
				new Item("Laptop",44000.00),
				new Item("Mobile",20000.00),
				};
		Comparator<Item> nameComp=(Item i1,Item i2)->i1.getName().compareTo(i2.getName());
		Comparator<Item> priceComp=(i1,i2)->(int)(i1.getPrice()-i2.getPrice());
		System.out.println("=====================Sort by name");
		Arrays.sort(it,nameComp);
		for(Item i:it) {
			System.out.println(i);
		}
		System.out.println("=====================Sort by price");
		Arrays.sort(it,priceComp);
		for(Item i:it) {
			System.out.println(i);
		}
	}

}
