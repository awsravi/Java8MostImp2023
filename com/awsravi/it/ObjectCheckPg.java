package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectCheckPg {

	public static void main(String[] args) {

		Object[] array1 = { new Object(), new Object(), new Object() };
		Object[] array2 = { new Object(), new Object(), new Object(), new Object() };

		List<Object> list1 = Arrays.asList(array1);
		List<Object> list2 = Arrays.asList(array2);

		List<Object> filterList = list2.stream().filter(o -> !list1.contains(o)).collect(Collectors.toList());
		System.out.println(filterList);

	}

}
