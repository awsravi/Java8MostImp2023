package com.aa1;

public class NumberHide {
public static void main(String[] args) {
	
	String s="9392803761";
	
	String output=s.replaceAll(".(?=.{2})", "#");
	System.out.println(output);
	
	
}
}
