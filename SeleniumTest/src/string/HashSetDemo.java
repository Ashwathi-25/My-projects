package string;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> text = new HashSet<String>();
		
		text.add("Hey");
		text.add("Hi");
		text.add("Hello");
		System.out.println(text);
		
		text.add("Vanakkam");
		System.out.println(text);
		
		/*
		for(String i:text) {
			System.out.println(i);
		}
		*/
		/*
		for(String i: text) {
			
			if(i == "Hi") {
				text.remove(i);
			}
		}
		*/
		Iterator<String> itr = text.iterator();
		
		while(itr.hasNext()) {
			
			String i = itr.next();
			if( i == "Hi") {
				
			itr.remove();
			}
		}
		System.out.println(text);

	}

}
