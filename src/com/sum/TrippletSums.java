package com.sum;

import java.util.Arrays;
import java.util.HashMap;

public class TrippletSums {

	public static void main(String[] args) {
//		int[] arr = { 7, -6, 3, 8, -1, 8, -11 };
		int[] arr = { 2, 1, -2, 2, -1, 3, 4, 5, 2 };
		int target = 6;
		twoPointerApproach(arr, target, arr.length);
		System.out.println(" ************** ");
		hashMapSolution(arr, target, arr.length);
	}

	private static void twoPointerApproach(int[] arr, int target, int length) {
		Arrays.sort(arr);
		for (int i = 0; i < length; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) {
				int tar = target - arr[i];
				int j = i + 1;
				int k = length - 1;
				while (j < k) {
					if (tar == arr[j] + arr[k]) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						while (j < k && arr[j] == arr[j + 1])
							j++;
						while (j < k && arr[k] == arr[k - 1])
							k--;
						j++;
						k--;
					} else if (tar > arr[j] + arr[k]) {
						j++;
					} else {
						k--;
					}
				}
			}

		}

	}

	private static void hashMapSolution(int[] arr, int target, int length) {
		Arrays.sort(arr);
		HashMap<Integer, Integer> mapFrequency = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (mapFrequency.containsKey(arr[i])) {
				mapFrequency.put(arr[i], mapFrequency.get(arr[i]) + 1);
			} else {
				mapFrequency.put(arr[i], 1);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			boolean fReduced = false;
			if (i == 0 || arr[i] != arr[i - 1]) {
				fReduced = true;
				mapFrequency.put(arr[i], mapFrequency.get(arr[i]) - 1);
				for (int j = i + 1; j < arr.length; j++) {
					boolean reduced = false;
					if (j == i+1 || arr[j] != arr[j - 1]) {
						reduced = true;
						mapFrequency.put(arr[j], mapFrequency.get(arr[j]) - 1);
						int thirdNo = target - arr[i] - arr[j];
						if (mapFrequency.containsKey(thirdNo)) {
							if (mapFrequency.get(thirdNo) >= 1) {
								System.out.println(arr[i] + " " + arr[j] + " " + thirdNo);
								mapFrequency.put(arr[i], mapFrequency.get(arr[i]) + 1);
								mapFrequency.put(arr[j], mapFrequency.get(arr[j]) + 1);
								fReduced = false;
								break;
							}
						}
					}
					if(reduced)
						mapFrequency.put(arr[j], mapFrequency.get(arr[j]) + 1);
				}
			}
			if (fReduced)
				mapFrequency.put(arr[i], mapFrequency.get(arr[i]) + 1);
		}

	}

}
