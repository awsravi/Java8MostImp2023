package com.stream.javatechie8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find2ndHighNumber {
	public static void main(String[] args) {

	List<Integer> num=Arrays.asList(5,9,11,2,8,21,1);
	Optional<Integer> find2ndHighNumber=num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	System.out.println("Find2ndHighNumber :"+find2ndHighNumber);
	
	//find2ndHighNumber.stream().map(n ->n+10).forEach(System.out::println);
	
	
	
	
	
	
	
	}
}
