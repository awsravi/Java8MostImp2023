package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighNumAdd10_1 {
	public static void main(String[] args) {
		
	Integer arrayList=Arrays.asList(5,10,15).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(arrayList);
	
	
	int res =arrayList+10;
	System.out.println("adding 10 :"+res);
	
}
}