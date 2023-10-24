package com.homsdev.files;

import java.io.File;

public class TreeCommand {

	public static void printTree(File[] files, String tabs) {
		String spaces = tabs.concat("-");
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.printf("%s %s \n", tabs, file.getName());
				} else {
					System.out.printf("%s %s \n", tabs, file.getName());
					printTree(file.listFiles(), spaces);
				}
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("/home/homs/Pictures");
		printTree(file.listFiles(), "-");
	}
}
