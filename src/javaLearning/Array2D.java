package javaLearning;

public class Array2D {

	public static void main(String[] args) {

		int[][] a = { { 6, 3, 9 }, { 7, 1, 2 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

//System.out.println(a[0][0]);
//System.out.println(a[0][1]);
//System.out.println(a[0][2]);
//System.out.println(a[1][0]);
//System.out.println(a[1][1]);
//System.out.println(a[1][2]);

//System.out.println(a.length); // Output => 2
//System.out.println(a[0].length); // Output => 3
//System.out.println(a[1].length); // Output => 3