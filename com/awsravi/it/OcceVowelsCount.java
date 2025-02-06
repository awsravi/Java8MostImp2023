package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OcceVowelsCount {
	public static void main(String[] args) {
		String str = "ravikumar";
		
		List<String> lstr = Arrays.asList(str.split(""));
		Map<String, Long> occe = lstr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(occe);

		Map<Character, Long> vowelocce = str.chars().filter(ch -> "aeiou".indexOf(ch) != -1).mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(vowelocce);
		
	}
}
