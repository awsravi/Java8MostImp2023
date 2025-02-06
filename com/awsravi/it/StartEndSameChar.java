package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.List;

public class StartEndSameChar {
	public static void main(String[] args) {
			List<String> lSting = Arrays.asList("cbc", "aba", "xyx", "xyz");
		lSting.stream().filter(s -> s.length() > 0 && s.endsWith(s.valueOf(s.charAt(0)))).forEach(System.out::println);

	}
}
