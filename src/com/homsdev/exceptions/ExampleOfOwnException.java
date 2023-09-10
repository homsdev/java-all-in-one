package com.homsdev.exceptions;

class IncorrectTitleUncheckedException extends RuntimeException {

	private static final long serialVersionUID = -513494871627225778L;

	public IncorrectTitleUncheckedException(String msg) {
		super(msg);
	}
}

class IncorrectTitleCheckedException extends Exception {

	private static final long serialVersionUID = 3748141249694278456L;

	public IncorrectTitleCheckedException(String msg) {
		super(msg);
	}
}

public class ExampleOfOwnException {

	static void registerCourse(String courseTitle) {
		if (courseTitle.trim().length() == 0) {
			throw new IncorrectTitleUncheckedException("Course title cannot be empty");
		}
		String res = String.format("Course %s was registered", courseTitle);
		System.out.println(res);
	}

	static void registerCourseWithCheckedException(String courseTitle) throws IncorrectTitleCheckedException {
		if (courseTitle.trim().length() == 0) {
			throw new IncorrectTitleCheckedException("Course title cannot be empty");
		}
		String res = String.format("Course %s was registered", courseTitle);
		System.out.println(res);
	}

	public static void main(String[] args) {
		registerCourse("Java");
		registerCourse("      s  ");

		try {
			registerCourseWithCheckedException("Javascript");
		} catch (IncorrectTitleCheckedException e) {
			e.printStackTrace();
		}
	}

}
