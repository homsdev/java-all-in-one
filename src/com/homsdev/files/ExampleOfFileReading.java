package com.homsdev.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ExampleOfFileReading {

	public static void main(String[] args) {
		File file = new File("/home/homs/Documents/io_example_java/example.txt");
		try (FileReader fileReader = new FileReader(file);) {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			do {
				line = bufferedReader.readLine();
				System.out.println(line != null ? line : "");
			} while (line != null);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
