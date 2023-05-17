package javaLearning;

public class Strings {
	public static void main(String[] args) {
		// Concat method
		String firstName = "John";
		String lastName = "Matthew";
		String fullName = firstName + " " + lastName;

		System.out.println(fullName);

		// Equal method
		String str1 = "Tusshar";
		String str2 = "Jason";
		String str3 = "Alex";
		String str4 = "Sam";
		String str5 = "Tusshar";

		System.out.println("Equal Method1: " + str1.equals(str2));
		System.out.println("Equal Method2: " + str1.equals(str3));
		System.out.println("Equal Method3: " + str1.equals(str4));
		System.out.println("Equal Method4: " + str1.equals(str5));

		// Length Method
		String s = "My name is Tusshar Rathod";
		System.out.println("Length of String S is: " + s.length());

		// SubString Method
		String q = "My name is Tusshar Rathod";
		System.out.println("SubString of String q is: " + q.substring(11));

		// Trim Method
		String t = "			My name is Tusshar Rathod			";
		System.out.println("Trimming of String t is: " + t.trim());

		// IndexOf Method
		String ind = "My name is Tusshar Rathod";
		System.out.println("Index of String ind is: " + ind.indexOf("Tusshar"));

		// Split Method

		String word1 = "This is splitted word";
		String[] word2 = word1.split(" ");

		for (String i : word2) {
			System.out.println(i);
		}
	}
}
