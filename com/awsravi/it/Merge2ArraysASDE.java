package com.stream.javatechie8.com.awsravi.it;

import java.util.Arrays;

public class Merge2ArraysASDE {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 6, 8 };
		int[] arr2 = { 4, 5, 7 };
		int[] result = mergeArrays(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				mergedArr[k++] = arr1[i++];
			} else {
				mergedArr[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			mergedArr[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			mergedArr[k++] = arr2[j++];
		}

		return mergedArr;
	}
}
