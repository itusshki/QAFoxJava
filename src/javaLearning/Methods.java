package javaLearning;

public class Methods {

	public static void main(String[] args) {

		methodA(9);
		int met = methodA(95);
		System.out.println("This is first method " + met);

//		methodA(7, 10);

	}

	public static int methodA(int x) {
		System.out.println("Single Parameterized Method with value of " + x);
		methodA(7, 10);
		return 5;

	}

	public static void methodA(int x, int y) {
		System.out.println("Multiple Parameterized Method with value of " + x + " & " + y);
		String str = methodA(21, 7.55, '$', "Tusshar", true);
		System.out.println("This is multi data type method " + str);
	}

	public static String methodA(int i, double d, char c, String str, boolean isBool) {
		System.out.println("Integer is " + i + ", double is " + d + ", char is " + c + ", String is " + str
				+ ", boolean is " + isBool);
		return "This is the End";
	}

}
