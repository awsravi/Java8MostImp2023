package com.stream.javatechie8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StringJoinPgm {
	public static void main(String[] args) {
		//output1-2-3-4
		List<String> str = Arrays.asList("1", "2", "3", "4");
		String res = String.join("-", str);
		System.out.println(res);
		
		//skip & limit example (2,9)
		
		IntStream.range(1, 10)
		.skip(1)
		.limit(9)
		.forEach(System.out::println);
	}
}
