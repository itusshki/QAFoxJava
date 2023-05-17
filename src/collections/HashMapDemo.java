package collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();

		hMap.put(001, "Tusshar");
		hMap.put(002, "Rajesh");
		hMap.put(003, "Jatin");
		hMap.put(004, "Paul");
		hMap.put(005, "Kewal");
		hMap.put(006, "Rajat");

		for (Integer i : hMap.keySet()) {
			System.out.println(hMap.get(i));
		}
	}
}
