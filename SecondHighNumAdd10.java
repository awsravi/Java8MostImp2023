package com.interview.ques;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighNumAdd10 {
	public static void main(String[] args) {

		int[] num = { 20, 33, 44, 50, 60 };
		int secondHighNumAdd10 = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println("secondHighNum  :" + secondHighNumAdd10);
		int res = secondHighNumAdd10 + 10;
		System.out.println("secondHighNumAdd10  :" + res);

	}
}
