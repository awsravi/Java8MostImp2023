package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
public static void main(String[] args) {
	
String[] strArr	={"AA","ZZ","PP","DD"};
	Arrays.asList(strArr).stream().sorted().forEach(System.out::println);
	
	Arrays.asList(strArr).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	
	
	
	
	
}
}
