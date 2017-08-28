package com.javamultiplex.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorInfo {

	public static void main(String[] args) {

		Class myClass = Student.class;
		System.out.println("Class name : " + myClass.getName());
		System.out.println("*******Constructors***************");
		Constructor[] constructors = myClass.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("Name : " + constructor.getName());
			System.out.println("Modifiers : " + Modifier.toString(constructor.getModifiers()));
			System.out.println("Parameters : " + constructor.getParameterCount());

			if (constructor.getParameterCount() != 0) {
				System.out.println("######Parameters#########");
				Class[] parameters = constructor.getParameterTypes();
				for (Class parameter : parameters) {
					System.out.println(parameter.getName());
				}
			}

			Class exceptions[] = constructor.getExceptionTypes();
			if (exceptions.length != 0) {
				System.out.println("-------------Throws Exceptions------------------");
				for (Class exception : exceptions) {
					System.out.println(exception.getName());
				}
			}

			Annotation[] annotations = constructor.getDeclaredAnnotations();

			if (annotations.length != 0) {
				System.out.println("$$$$$$$$$Annotations$$$$$$$$$");
				for (Annotation annotation : annotations) {
					System.out.println(annotation);
				}
				StudentAnnotation myAnnotation = constructor.getDeclaredAnnotation(StudentAnnotation.class);
				System.out.println("Name : " + myAnnotation.name());
				System.out.println("Roll number : " + myAnnotation.rollNumber());
				System.out.println("Marks : " + myAnnotation.marks());
			}

			System.out.println("******************************");
		}
	}
}
