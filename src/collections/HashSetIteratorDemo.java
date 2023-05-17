package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorDemo {
	public static void main(String[] args) {

		HashSet<Double> hSet = new HashSet<>();

		hSet.add(69.44);
		hSet.add(54.75);
		hSet.add(66.49);
		hSet.add(27.91);
		hSet.add(67.14);
		hSet.add(43.95);

		// Iterator and iterator()

		Iterator<Double> itr = hSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
