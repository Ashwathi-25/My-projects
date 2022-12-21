package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,Integer> salary = new HashMap<String,Integer>();
		
		salary.put("Ramesh", 10000);
		salary.put("Suresh", 10200);
		salary.put("Sarvesh", 10500);
		
		System.out.println(salary);
		
		System.out.println(salary.get("Ramesh"));
		
		System.out.println(salary.put("Aadhesh", 10900));
		
		Iterator<Entry<String,Integer>>  itr = salary.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String i : salary.keySet()) {
			System.out.println("Key "+ i + " Value " + salary.get(i));
		}
		
		

	}

}
