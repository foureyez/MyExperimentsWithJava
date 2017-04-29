package javaexp.practise.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAndStringOut {
	public static void main(String args[]){
	    Person p = new Person(1, "Abhijeet");
		List<Person> personList = new ArrayList<>();
		Map<String, String> mapString = new HashMap<>();
		personList.add(p);
		personList.add(p);
		personList.add(p);
		personList.add(p);
		personList.add(p);
		personList.add(p);
		personList.add(p);
		
		String as ="Abhijeet";
		System.out.println(""+as.substring(0,1));
		mapString.put("Abhijeet", "1");
		mapString.put("Abhay", "2");
		mapString.put("Anusha", "3");
		mapString.put("Vipin", "4");
		mapString.put("Anmol", "5");
		mapString.put("Piyush", "6");
		mapString.put("Anurag", "7");
		
		
	}
}