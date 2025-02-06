package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupElemFromString {
	public static void main(String[] args) {
		String str = "ravikumar";
		List<String> strList = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream().filter(s ->s.getValue()>1)
				.map(s ->s.getKey())
				.collect(Collectors.toList());
		System.out.println(strList);

	}
}
