package com.sum;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = {11,3,7,9,14,2};
		int target = 17;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i<arr.length; i++) {
			int j = target - arr[i];
			if (map.containsKey(j)) {
				System.out.println(map.get(j)+" "+j);
				break;
			} else {
				map.put(arr[i],i);
			}
		}
	}
}
