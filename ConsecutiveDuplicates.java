package com.sep.it;


	import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
