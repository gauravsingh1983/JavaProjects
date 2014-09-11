package com.test.collections.hashmaps;


import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Dog implements Comparable<Dog> {
	String color;

	Dog(String c) {
		color = c;
	}
	public boolean equals(Object o) {
		return ((Dog) o).color == this.color;
	}
 
	public int hashCode() {
		return color.length();
	}
	public String toString(){	
		return color + " dog";
	}
	@Override
	public int compareTo(Dog o)
	{
		// TODO Auto-generated method stub
		return this.color.compareTo(o.color);
	}
}


public class TestTreeMap {
	public static void main(String[] args) {
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		
		TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
		
		Set<Entry<Dog, Integer>> entries = treeMap.entrySet();
		
		for(Entry<?, ?> entry : entries) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
			}
	}
}
