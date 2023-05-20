package com.stream.javatechie8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNONRepeatUnique {

	public static void main(String[] args) {

		String str = "ravikumar";
		String firstNONRepeatUnique = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() == 1).map(n -> n.getKey()).findFirst().get();
		System.out.println("FirstNONRepeatUnique :" + firstNONRepeatUnique);

	}

}
