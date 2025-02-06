package com.stream.javatechie8.com.awsravi.it;

public class Random4digits {
	public static void main(String[] args) {
		int random = (int) (Math.random()*900)+1000;

		String output = String.valueOf(random);

		System.out.println(output);

	}
}
