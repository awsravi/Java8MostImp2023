package com.stream.javatechie8.com.awsravi.it;

public class ReplaceSplChar {
	public static void main(String[] args) {

		String s = "@!#$&^!kala";

		String output = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(output);
	}
}
