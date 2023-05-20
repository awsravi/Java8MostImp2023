package com.infinity.a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatChar {
 public static void main(String[] args) {
	String input ="ababab";
	Map<Character, Long> charCount=input.chars().mapToObj(i -> (char)i)
	.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	
	Optional<Character> firstRepeatChar=charCount.entrySet().stream().filter( (e) -> e.getValue()>1).map(e ->e.getKey()).findFirst();
	
	System.out.println("FirstRepeatChar :"+firstRepeatChar);
	
	
	
	
}
	
	
	
}
