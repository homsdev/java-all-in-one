package com.homsdev.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleKeyBoardReading {

	public static String readMessage(String prompt) throws IOException {
		System.out.printf(prompt);
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(reader);
		return bf.readLine();
	}
	
	public static Integer readInt(String prompt) throws NumberFormatException, IOException {
		return Integer.parseInt(readMessage(prompt));
	}

	public static void main(String[] args) throws IOException {
		System.out.printf("Your name is: %s \n",readMessage("name->"));
		System.out.printf("Your name is: %s \n",readInt("name->"));	
	}
}
