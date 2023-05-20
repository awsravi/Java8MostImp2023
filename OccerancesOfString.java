package com.apexon;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccerancesOfString {

	public static void main(String[] args) {
		/*
		 * Print occurrence of each word in list Input: List l1 ={"test", "for",
		 * "test"}; Output: {test=2, for=1}
		 * 
		 */
		
	List<String> strList= Arrays.asList("test","for","test");
	Map<String, Long> occe= strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	System.out.println(occe);
	
	//String s = "success";

	// Stream
	Map<String, Long> str = Arrays.asList("success".split("")).stream().sorted()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	System.out.println(str);
	
	
	
	}

}
