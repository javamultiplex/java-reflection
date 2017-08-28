package com.javamultiplex.annotation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AnnotationExample {

	public static void main(String[] args) {
	}

	@Override
	@MethodInfoAnnotation(author = "Agarwal", comment = "Main method", date = "Nov 17 2012", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfoAnnotation(comment = "deprecated method", date = "Nov 17 2012")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@MethodInfoAnnotation(author = "Agarwal", comment = "Main method", date = "Nov 17 2012", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		List l = new ArrayList();
		l.add("abc");
		oldMethod();
	}

}
