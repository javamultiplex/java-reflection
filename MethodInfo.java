package com.javamultiplex.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodInfo {

	public static void main(String[] args) {

		Student student = new Student();
		Class myClass = student.getClass();
		System.out.println("Class name : " + myClass.getName());
		System.out.println("********Methods**********");
		Method methods[] = myClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Name : " + method.getName());
			System.out.println("Modifiers : " + Modifier.toString(method.getModifiers()));
			System.out.println("Return type : " + method.getReturnType().getName());
			System.out.println("Number of Parameters : " + method.getParameterCount());
			Class parameters[] = method.getParameterTypes();
			if (method.getParameterCount() != 0) {
				System.out.println("#######Parameters#########");
				for (Class parameter : parameters) {
					System.out.println(parameter.getName());
				}
			}
			Class exceptions[] = method.getExceptionTypes();
			if (exceptions.length != 0) {
				System.out.println("-------------Throws Exceptions------------------");
				for (Class exception : exceptions) {
					System.out.println(exception.getName());
				}
			}

			Annotation[] annotations = method.getDeclaredAnnotations();
			if (annotations.length != 0) {
				System.out.println("$$$$$$$$$Annotations$$$$$$$$$");
				for (Annotation annotation : annotations) {
					System.out.println(annotation);
				}
				StudentAnnotation myAnnotation = method.getAnnotation(StudentAnnotation.class);
				System.out.println("Name : " + myAnnotation.name());
				System.out.println("Roll number : " + myAnnotation.rollNumber());
				System.out.println("Marks : " + myAnnotation.marks());

			}

			System.out.println("**********************************");
		}
	}

}
