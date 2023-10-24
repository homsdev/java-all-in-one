package com.homsdev.files;

import java.io.File;

public class ExampleOfFile {
	public static void main(String[] args) {
		File file = new File("/opt");
		System.out.printf("Is file: %s\n",file.isFile());
		System.out.printf("Is directory: %s\n",file.isDirectory());
		System.out.printf("Is readable: %s\n",file.canRead());
		System.out.printf("Is writeable: %s\n",file.canWrite());
		
		File[] content = file.listFiles();
		
		for (File f : content) {
			System.out.printf("::::File: %s ::::\n",f.getName());
			System.out.printf("Is file: %s\n",f.isFile());
			System.out.printf("Is directory: %s\n",f.isDirectory());
			System.out.printf("Is readable: %s\n",f.canRead());
			System.out.printf("Is writeable: %s\n",f.canWrite());
		}
	}
}
