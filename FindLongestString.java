package com.stream.javatechie8;

import java.util.Arrays;
import java.util.List;

public class FindLongestString {
	public static void main(String[] args) {
		List<String> arrStr = Arrays.asList("ravi", "ravikumar", "kulasekhar");

		String findLongestString=arrStr.stream().reduce((w1,w2) ->w1.length()>w2.length()?w1:w2)
		.get();
		System.out.println("FindLongestNum :"+findLongestString);
		
		
	}
}
