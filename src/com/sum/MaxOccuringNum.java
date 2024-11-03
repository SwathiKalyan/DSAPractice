package com.sum;

public class MaxOccuringNum {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 3, 2, 3, 3, 2, 2, 3, 3, 2, 3, 3, 3 };
		int candidate = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == candidate) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				candidate = arr[i];
				count = 1;
			}
		}
		count = 0;
		for (int j : arr) {
			if (j == candidate) {
				count++;
			}
		}
		if (count > arr.length / 2) {
			System.out.println(candidate);
		} else {
			System.out.println(-1);
		}
	}

}
