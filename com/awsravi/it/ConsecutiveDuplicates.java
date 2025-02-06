package com.stream.javatechie8.com.awsravi.it;


	import java.util.LinkedHashMap;
	import java.util.stream.Collectors;

	public class ConsecutiveDuplicates {
	    public static void main(String[] args) {
	        String s1 = "abcabcbb";
	    
	          String output = s1.chars().mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.toList()))
	                .values()
	                .stream()
	                .map(list -> list.get(1))
	                .map(Object::toString)
	                .collect(Collectors.joining(""));
	            System.out.println("RemoveConsecutiveDuplicates :"+output);
	            
	            
	            
	            
	            
	            
	            
	    }
	

}
