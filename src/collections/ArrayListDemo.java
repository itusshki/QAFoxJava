package collections;

import java.util.ArrayList;
import java.util.Collection;

//import java.util.ArrayList;
//import java.util.Collection;

public class ArrayListDemo {
	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<Integer>(); // ArrayList Object Creation

		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		for (Integer temp : list) {
			System.out.println(temp);
		}

	}

}
