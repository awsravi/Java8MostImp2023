package com.interview.ques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddTotalsumArray {
	public static void main(String[] args) {
		List<Integer> listarr = Arrays.asList(10, 20, 30, 40, 50);
		Integer sum = listarr.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		// multi

		List<Integer> mulsum = listarr.stream().map(n -> n + sum).collect(Collectors.toList());
		System.out.println(mulsum);
	}
}
