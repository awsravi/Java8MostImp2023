package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUppercase {
public static void main(String[] args) {
	
	List<String> lString=Arrays.asList("Usa","Japan","India");
	List<String> str=lString.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(str);
	
}
}
