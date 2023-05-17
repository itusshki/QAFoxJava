package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandlingFile {

	public static void main(String[] args) throws IOException {
		File file1 = new File("C:\\Users\\Tusshar Rathod\\Documents\\Collections.png");

		File file2 = new File("demo.txt"); // this is shortcut path because this file is in project folder

		File file3 = new File("Abc\\Xyz\\abcxyz.txt"); // this is shortcut path because this file is in project folder

//		System.out.println(file1.getAbsolutePath());
//		System.out.println(file2.getAbsolutePath());
//		System.out.println(file3.getAbsolutePath());

		FileReader fr = new FileReader(file2);
		BufferedReader br = new BufferedReader(fr);

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

//		System.out.println(br.readLine()); // Output -> this is line 1
//		System.out.println(br.readLine()); // Output -> this is line 2
//		System.out.println(br.readLine()); // Output -> this is line 3
//		System.out.println(br.readLine()); // Output -> this is line 4
//		System.out.println(br.readLine()); // Output -> this is line 5

	}
}
