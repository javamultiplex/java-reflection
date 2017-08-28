package com.javamultiplex.annotation;

import java.io.IOException;

@StudentAnnotation
public class Student {

	@StudentAnnotation(name = "javamultiplex")
	private String name;
	private static int rollNumber = 101;
	@StudentAnnotation(marks = 90)
	private float marks;

	@StudentAnnotation
	public Student() {
	}

	public Student(String name) throws Exception {
		this.name = name;
	}

	@StudentAnnotation(name = "Shivani", marks = 60)
	public Student(String name, float marks) throws NumberFormatException, IOException {
		this.name = name;
		this.marks = marks;
	}

	public Student(Float marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	@StudentAnnotation(name = "Bhavna")
	public void setName(String name) throws NumberFormatException {
		this.name = name;
	}

	public static int getRollNumber() {
		return rollNumber;
	}

	@StudentAnnotation(rollNumber = 110)
	public static void setRollNumber(int rollNumber) {
		Student.rollNumber = rollNumber;
	}

	public float getMarks() throws IOException, ArithmeticException {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
