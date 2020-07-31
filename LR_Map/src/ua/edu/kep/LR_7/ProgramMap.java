package ua.edu.kep.LR_7;

import java.util.HashMap;
import java.util.Map;

public class ProgramMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("the average score of the group", 5);
		map.put("the average score of the course", 5);
		map.put("the average score of the faculty", 4);
		map.put("the average score of the college", 4);
		map.put("the average score of the city", 4);
		map.put("the average score of the region", 4);

		System.out.println("-------------------------------------------------");
		
		for (String eachKey : map.keySet()) {
		   System.out.println(eachKey);
		}

		System.out.println("-------------------------------------------------");
	
		for (Integer eachValue : map.values()) {
			System.out.println(eachValue);
		}
		
		System.out.println("-------------------------------------------------");
		for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
		   System.out.println(eachEntry.getKey() + " = " + eachEntry.getValue());
		}


		Integer mark = map.get("the average score of the college");
		System.out.println("the average score of the college = " + mark);

		
		Integer t = map.get("test");
		System.out.println("test = " + t);
		
		boolean hasKey = map.containsKey("the average score of the group");
		System.out.println("Is key ‘the average score of the group‘? " + hasKey);

		hasKey = map.containsKey("test");
		System.out.println("Is key ‘test‘? " + hasKey);


		boolean hasValue = map.containsValue(5);
		System.out.println("Is value ‘5‘?" + hasValue);

	
		hasValue = map.containsValue(-1);
		System.out.println("Is value ‘-1‘?" + hasValue);

		System.out.println("The number of elements in the Map is equal" + map.size());
	
	
		map.put("minimum score", 3);


		if (map.containsKey("minimum score") == true) {
		System.out.println("The pair was added successfully with the value" + map.get("minimum score"));
		}
		else {
		   System.out.println("Pair adding failed");
		}

		map.put("the average score of the region", 3);
		
		if (map.get("the average score of the region") == 3) {
		System.out.println("The pair was added successfully with the value" + map.get("the average score of the region"));
		}
		else {
		   System.out.println("Pair adding failed");
		}

		map.clear();
		
		if(map.isEmpty() == true) {
			System.out.println("The Map has indeed been cleared");
			System.out.println("Number of elements  = " + map.size());
		} else {
			System.out.println("The Map hasn't been cleared");
			System.out.println("Number of elements  = " + map.size());
		}
	}

}
