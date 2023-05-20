package com.apexon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenUseStreams {
public static void main(String[] args) {
	List<Integer> arrList=Arrays.asList(2,3,4,5,6,7);
	List<Integer> even=arrList.stream().filter(n ->n%2==0).collect(Collectors.toList());
	System.out.println(even);
}
}
