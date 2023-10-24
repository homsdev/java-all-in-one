package com.homsdev.files;

import java.io.File;
import java.io.PrintWriter;

public class ExampleOfWritingOnFile {
	public static void main(String[] args) {
		File file = new File("/home/homs/Documents/io_example_java/example.txt");
		try (PrintWriter printWriter = new PrintWriter(file)) {
			printWriter.println("Hello");
			printWriter.println("Follow Me");
			printWriter.println("@HomdDevSS");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
