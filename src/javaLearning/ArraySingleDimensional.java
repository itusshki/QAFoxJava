package javaLearning;

public class ArraySingleDimensional {

	public static void main(String[] args) {

//		int[] a = new int[3];

		// Appending the arrays as per index
//		a[0] = 95;
//		a[1] = 62;
//		a[3] = 24;

		int[] a = { 65, 85, 63, 4, 25, 9, 7, 4, 3, 6, 9, 8, 5, 55, 37, 69, 41 };

		// Length for calculating length of array a
		System.out.println(a.length);

		// for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// for-each loop
		for (int array : a) {
			System.out.println(array);
		}

	}

}
