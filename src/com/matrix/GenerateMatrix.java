package com.matrix;

import com.twodArray.MatrixRotation;

public class GenerateMatrix {
	public static void main(String args[]) {
		int A = 5;
		int[][] matrix = new int[A][A];
		
		int[] arr = new int[A*A];
		
		int rmin=0, rmax=matrix.length-1, cmin=0, cmax=matrix[0].length-1;
		
		for (int i=0; i<(A*A);i++) {
			arr[i] = i+1;
			System.out.println(i+1);
		}
		int i = 1;
		while (i<=A*A) {
			
			for (int col=cmin;col<=cmax && i <= A*A ;col++) {
				matrix[rmin][col] = i;
				i++;
			}
			rmin++;
			for (int row=rmin;row<=rmax  && i <= A*A ;row++) {
				matrix[row][cmax] = i;
				i++;
			}
			cmax--;
			for (int col=cmax;col>=cmin && i <= A*A ;col--) {
				matrix[rmax][col] = i;
				i++;
			}
			rmax--;
			for (int row=rmax;row>=rmin && i <= A*A ;row--) {
				matrix[row][cmin] =i;
				i++;
			}
			cmin++;
			
		}
		
		MatrixRotation.printMatrix(matrix);
		
	}

}
