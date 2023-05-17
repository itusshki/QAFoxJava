package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<>();

		alist.add(95);
		alist.add(51);
		alist.add(74);
		alist.add(31);
		alist.add(82);

		// Iterator and iterator()

		Iterator<Integer> itr = alist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
