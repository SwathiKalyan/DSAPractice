package com.twodArray;

public class PickFromBothSides {
	
	public static void  main(String args[]) {
		int[] arr = {-969,-948,350,150,-59,724,966,430,107,-809,-993,337,457,-713,753,-617,-55,-91,-791,758,-779,-412,-578,-54,506,30,-587,168,-100,-409,-238,655,410,-641,624,-463,548,-517,595,-959,602,-650,-709,-164,374,20,-404,-979,348,199,668,-516,-719,-266,-947,999,-582,938,-100,788,-873,-533,728,-107,-352,-517,807,-579,-690,-383,-187,514,-691,616,-65,451,-400,249,-481,556,-202,-697,-776,8,844,-391,-11,-298,195,-515,93,-657,-477,587};
		int B = 81;
		System.out.println(solve(arr,B));
	}

	public static int solve(int[] A, int B) {
		int leftIndex = 0;
		int rightIndex = A.length - 1;
		int sum = Integer.MIN_VALUE;
		int[] leftSum = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			if (i == 0)
				leftSum[i] = A[i];
			else
				leftSum[i] = leftSum[i - 1] + A[i];
		}
		int[] rightSum = new int[A.length];
		for (int i = A.length - 1; i >= 0; i--) {
			if (i == A.length - 1)
				rightSum[i] = A[i];
			else
				rightSum[i] = rightSum[i + 1] + A[i];
		}

		for (int i = B - 1, j = A.length; i >= -1 && j >= A.length-B; i--, j--) {
			if (i == B - 1)
				sum = Math.max(sum, leftSum[i]);
			else if (i < 0)
				sum = Math.max(sum, rightSum[j]);
			else
				sum = Math.max(sum, leftSum[i] + rightSum[j]);
		}
		return sum;

	}

}
