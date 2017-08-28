package com.javamultiplex.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;

public class ClassInfo {

	public static void main(String[] args) {

		Class<Student> student = Student.class;
		System.out.println("Full Name : " + student.getName());
		System.out.println("Simple Name : " + student.getSimpleName());
		System.out.println("Modifiers : " + Modifier.toString(student.getModifiers()));
		Annotation annotations[] = student.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		StudentAnnotation myAnnotation = student.getAnnotation(StudentAnnotation.class);
		System.out.println("Name : " + myAnnotation.name());
		System.out.println("Roll number : " + myAnnotation.rollNumber());
		System.out.println("Marks : " + myAnnotation.marks());
	}

}
