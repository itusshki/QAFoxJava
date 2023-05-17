package collections;

import java.util.Collection;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		Collection<Integer> hashSet = new HashSet<>();

		hashSet.add(66);
		hashSet.add(55);
		hashSet.add(33);
		hashSet.add(88);
		hashSet.add(77);

		for (Integer i : hashSet) {
			System.out.println(i);
		}
	}
}
