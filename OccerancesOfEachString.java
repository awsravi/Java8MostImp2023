package com.stream.javatechie8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccerancesOfEachString {
	public static void main(String[] args) {

		String str = "success";
		Map<String, Long> occe = Arrays.asList(str.split("")).stream().sorted()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(occe);

		List<String> strList = Arrays.asList("test", "for", "test");
		Map<String, Long> occe1 = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(occe);

	}
}
