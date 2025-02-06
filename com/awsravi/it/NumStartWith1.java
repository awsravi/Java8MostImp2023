package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartWith1 {
	public static void main(String[] args) {

		List<Integer> num=Arrays.asList(5,9,11,2,8,21,1);
	 List<String>	numStartWith1 =num.stream().map(s ->s+"")
		.filter(s ->s.startsWith("1"))
		.collect(Collectors.toList());
		System.out.println("NumStartWith1 :"+numStartWith1);
		
		//.forEach(System.out::println);
	
	
	
	}
}
