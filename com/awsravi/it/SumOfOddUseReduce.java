package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;
import java.util.List;

public class SumOfOddUseReduce {
public static void main(String[] args) {
	List<Integer> arrayList=Arrays.asList(5,10,15);
	int sum=arrayList.stream().filter(n ->n%2!=0).reduce(0,Integer::sum);
	System.out.println(sum);
	
}
}
