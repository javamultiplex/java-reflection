package com.javamultiplex.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldInfo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		try {
			Class student = Class.forName("com.javamultiplex.annotation.Student");
			Field fields[] = student.getDeclaredFields();
			System.out.println("Class name : " + student.getName());
			System.out.println("*****Fields******");
			for (Field field : fields) {
				System.out.println("Name : " + field.getName());
				System.out.println("Modifiers : " + Modifier.toString(field.getModifiers()));
				System.out.println("Type : " + field.getType().getName());
				if (!field.isAccessible()) {
					field.setAccessible(true);
				}
				System.out.println("Value : " + field.get(new Student()));

				Annotation[] annotations = field.getDeclaredAnnotations();
				if (annotations.length != 0) {
					System.out.println("$$$$$$$$$Annotations$$$$$$$$$");
					for (Annotation annotation : annotations) {
						System.out.println(annotation);
					}
					StudentAnnotation myAnnotation = field.getAnnotation(StudentAnnotation.class);
					System.out.println("Name : " + myAnnotation.name());
					System.out.println("Roll number : " + myAnnotation.rollNumber());
					System.out.println("Marks : " + myAnnotation.marks());

				}

				System.out.println("*******************************************");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
