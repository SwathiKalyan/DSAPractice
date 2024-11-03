package com.matrix;

import com.twodArray.MatrixRotation;

public class SprialMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 3 }, { 5, 6, 7, 8, 4 }, { 9, 10, 11, 12, 7 }, { 13, 14, 15, 16, 7 },
				{ 8, 6, 3, 5, 9 } };

		int rowMin = 0, rowMax = matrix.length - 1;
		int colMin = 0, colMax = matrix[0].length - 1;
		int n = matrix.length, m=matrix[0].length;

		int count = 0;
		MatrixRotation.printMatrix(matrix);
		System.out.println(" ");

		// row fixed, column change by +1
		while (count < n * m) {
			for (int j = colMin; j <= colMax && count < n*m; j++) {
				System.out.print(matrix[rowMin][j] + " ");
				count++;
			}
			rowMin++;
			System.out.println();
			// column fixed, row change by +1
			for (int i = rowMin; i <= rowMax && count < n*m; i++) {
				System.out.print(matrix[i][colMax] + " ");
				count++;
			}
			colMax--;
			System.out.println();
			// row fixed, column change by -1
			for (int j = colMax; j >= colMin && count < n*m; j--) {
				System.out.print(matrix[rowMax][j] + " ");
				count++;
			}
			rowMax--;
			System.out.println();
			// column fixed, row change by 11
			for (int i = rowMax; i >= rowMin && count < n*m; i--) {
				System.out.print(matrix[i][colMin] + " ");
				count++;
			}
			colMin++;
		}
	}

}
