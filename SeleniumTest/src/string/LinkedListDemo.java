package string;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("Pakistan");
		countries.add("The USA");
		System.out.println(countries);
		countries.addFirst("The UK");
		System.out.println(countries);
		countries.add(1,"Canada");
		System.out.println(countries);
		
		

	}

}
