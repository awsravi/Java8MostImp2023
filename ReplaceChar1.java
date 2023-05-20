package com.aa1;

public class ReplaceChar1 {
	public static void main(String[] args) {

		String str="Eelcome to java";
		System.out.println("O S :"+str);
		int index =0;
		char ch='w';
		
		StringBuilder sb=new StringBuilder(str);
		sb.setCharAt(index, ch);
		System.out.println("N S :"+sb);
	}
}
