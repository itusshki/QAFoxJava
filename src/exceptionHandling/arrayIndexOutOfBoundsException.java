package exceptionHandling;

public class arrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		try {
			int[] a = new int[3];

			a[0] = 8;
			a[1] = 4;
			a[2] = 7;
			a[3] = 6;
			for (int arr : a) {
				System.out.println(arr);
			}

		} catch (Throwable t) { // Here throwable is parent class of Exception
			System.out.println("Exception has been handled: Error- " + t);
		}

	}

}
