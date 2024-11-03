package com.twodArray;

import java.util.ArrayList;

public class SubArrays {
	public static void main(String args[]) {
		int[] A = new int[] { 1, 2, 3 };
		int[][] subArray = solve(A);
		for (int[] a : subArray) {
			System.out.print("[");
			for (int k = 0; k<a.length; k++) {
				if (k>0) {
					System.out.print(", ");
				}
				System.out.print(a[k]);
				
			}
			System.out.println("]");
		}

	}

	public static int[][] solve(int[] A) {
		int n = A.length;
		int s = (n * (n + 1)) / 2;
		int[][] subArrays = new int[s][];
		int index = 0;

		for (int start = 0; start < n; start++) {
			for (int end = start; end < n; end++) {
				subArrays[index] = new int[end - start + 1];
				for (int i = start; i <= end; i++) {
					subArrays[index][i - start] = A[i];
				}
				index++;
			}
		}

		return subArrays;
	}
}
