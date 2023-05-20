package com.aa1;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {

		String s = "kala";

		Optional<String> optional = Optional.ofNullable(s);
		 System.out.println("avali : " + optional.get());

			/*
			 * if (optional.isPresent()) { System.out.println(optional.get()); } else {
			 * System.out.println("valid value not pass"); }
			 */
	}
}
