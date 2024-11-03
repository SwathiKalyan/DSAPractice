package com.dsa.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {41, 9, 9, 48, 11, 2, 11, 12, 28, 10, 15, 4, 16, 48};
		//printArray(bubbleSort(arr));
		int i = 25; // 11001    00110   1100100
		System.out.println(i >> 2);
	}
	
	public static int[] bubbleSort(int[] arr) {
		int i, j, tmp;
		int n = arr.length;
		boolean swapped;
		for (i=0;i<n;i++) {
			swapped = false;
			for (j=0;j<n-i-2;j++) {
				if (arr[j] > arr[j+1]) {
				tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
				swapped = true;
				} 
			}
			if(!swapped) {
				break;
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i: arr) {
			System.out.print(i + " ");
		}
	}
}
