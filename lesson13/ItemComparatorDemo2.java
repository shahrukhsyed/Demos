package com.capgemini.lesson13;

import java.util.Arrays;
import java.util.Comparator;

class Comparision{
	
	public int compareByName(Item i1,Item i2) {
	return i1.getName().compareTo(i2.getName());
    }
	
	public static int compareByPrice(Item i1,Item i2) {
		double diff=i1.getPrice()-i2.getPrice();
		if(diff>0)
			return 1;
		else if(diff<0)
			return -1;
		else 
			return 0;
	}
}

public class ItemComparatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item it[]= {new Item("PC",34000.00),
				new Item("Laptop",44000.00),
				new Item("Mobile",20000.00),
				};
		
		Comparision c=new Comparision();
		Comparator<Item> nameComp=c::compareByName;
		Comparator<Item> priceComp=Comparision::compareByPrice;
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
