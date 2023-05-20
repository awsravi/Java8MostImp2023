package com.interview.ques;

import java.util.Arrays;
import java.util.List;

public class Count1s0sUsingstreams {

	public static void main(String[] args) {
		
		Integer[] arr= {1,0,1,0,0,1,1,1,0};
		List<Integer> list=Arrays.asList(arr);
		Integer sum=list.stream().reduce(0,Integer::sum);
		System.out.println("numbers of 1s :"+sum);
		System.out.println("no of 0s :"+(list.size()-sum));
		
	}
}
