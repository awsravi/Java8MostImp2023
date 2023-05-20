package com.infinity.a;

public class PowerWithOutUsingMulDiv {

	public static int power(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		}
		return base * power(base, exponent - 1);

	}

	public static int div(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		}
		return base * power(base, exponent - 1);

	}

	public static void main(String[] args) {
		int base = 2;
		int exponent = 3;
		System.out.println(power(base, exponent));
	}

}
