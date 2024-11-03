package com.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class QuadrupletsSum {
	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<>( );
		A.add(-1);
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(0);
		A.add(2);
		A.add(-2);
		
		
		int B = 0;
		Collections.sort(A);
		Integer[] arr = new Integer[A.size()];
        arr = A.toArray(arr);
		Map<Integer, Integer> allNumbers = new HashMap<>();
		for (int i : A) {
			if (allNumbers.containsKey(i))
				allNumbers.put(i, allNumbers.get(i) + 1);
			else
				allNumbers.put(i, 1);
		}

		Set<ArrayList<Integer>> results = new HashSet<>();

		for (int i = 0; i < arr.length - 3; i++) {
			boolean fReduced = false;
			if (i == 0 || arr[i] != arr[i - 1]) {
				fReduced = true;
				allNumbers.put(arr[i], allNumbers.get(arr[i]) - 1);
				for (int j = i + 1; j < arr.length - 2; j++) {
					boolean sReduced = false;
					if (j == i + 1 || arr[j] != arr[j - 1]) {
						sReduced = true;
						allNumbers.put(arr[j], allNumbers.get(arr[j]) - 1);
						for (int k = j + 1; k < arr.length - 1; k++) {
							boolean tReduced = false;
							if (k == j + 1 || arr[k] !=arr[k - 1]) {
								tReduced = true;
								allNumbers.put(arr[k], allNumbers.get(arr[k]) - 1);
								int fourthNum = B - arr[k] - arr[j] -arr[i];
								ArrayList<Integer> qSet = new ArrayList<>();
								if (allNumbers.containsKey(fourthNum)) {
//									System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + fourthNum);
									if (allNumbers.get(fourthNum) > 0) {
										qSet.add(arr[i] );
										qSet.add(arr[j] );
										qSet.add(arr[k] );
										qSet.add(fourthNum);
										Collections.sort(qSet);  
										results.add(qSet);
//										fReduced = false;
//										sReduced = false;
										break;
									}

								}
							}
							if (tReduced)
								allNumbers.put(arr[k], allNumbers.get(arr[k]) + 1);
						}
					}
					if (sReduced)
						allNumbers.put(arr[j], allNumbers.get(arr[j]) + 1);
				}
			}
			if (fReduced)
				allNumbers.put(arr[i], allNumbers.get(arr[i]) + 1);
			System.out.println(results.size());

		}
		ArrayList<ArrayList<Integer>> resultList = new ArrayList<>(results);
		System.out.println(resultList);
		sorting(resultList);
		}
	
	public static void sorting(ArrayList<ArrayList<Integer>> resultList) {
		for (ArrayList<Integer> list: resultList) {
			System.out.println(list);
		}
	}

	}

