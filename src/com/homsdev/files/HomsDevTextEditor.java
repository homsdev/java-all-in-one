package com.homsdev.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class HomsDevTextEditor {

	public static final String BASE_PATH = "/home/homs/Documents/io_example_java";

	public static String readMessage() throws IOException {
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(streamReader);
		return reader.readLine();
	}

	public static void main(String[] args) {
		String fileName;
		try {
			System.out.println("Indicate file name:");
			fileName = readMessage();
			File file = new File(BASE_PATH.concat(File.separator).concat(fileName));
			System.out.println("Start writing, type exit to terminate process");
			PrintWriter writer = new PrintWriter(file);
			String line = null;
			do {
				line = readMessage();
				if (!"exit".equals(line))
					writer.println(line);
			} while (!"exit".equals(line));

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
