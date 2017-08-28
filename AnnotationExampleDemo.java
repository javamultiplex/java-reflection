package com.javamultiplex.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExampleDemo {

	public static void main(String[] args) {
		Class<AnnotationExample> myClass = AnnotationExample.class;
		for (Method method : myClass.getDeclaredMethods()) {
			if (method.isAnnotationPresent(MethodInfoAnnotation.class)) {
				System.out.println("Method : " + method);
				System.out.println("***********************");
				for (Annotation annotation : method.getDeclaredAnnotations()) {
					System.out.println("Annotation : " + annotation);
				}
				MethodInfoAnnotation info = method.getAnnotation(MethodInfoAnnotation.class);
				if (info.revision() == 1) {
					System.out.println("Method : " + method.getName() + " has revision 1");
				}
				System.out.println("-----------------------------------------");

			}
		}
	}
}
