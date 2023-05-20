package com.cgi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merging2listTo1List {
	public static void main(String[] args) {

		Integer[] a = new Integer[] { 1, 3, 5,4 };
		Integer[] b = new Integer[] { 2, 4, 6 };

		Object[] c = concatenate(a, b);

		System.out.println("Merged object array : " + Arrays.toString(c));
	}
	public static Object[] concatenate(Integer[] a, Integer[] b) {

		return Stream.of(a, b).flatMap(Stream::of).sorted().distinct().toArray();
	}


	
	
	
	}

