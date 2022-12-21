package string;
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap <String,Integer> salary = new TreeMap<String,Integer>();
		
		salary.put("Ramesh", 10000);
		salary.put("Suresh", 10200);
		salary.put("Sarvesh", 10500);

		System.out.println(salary.headMap("Suresh"));
		
		System.out.println(salary.tailMap("Sarvesh"));
		
		System.out.println(salary.get("Ramesh"));
		
		System.out.println(salary.subMap("Ramesh", "Suresh"));
		
		
	}

}
