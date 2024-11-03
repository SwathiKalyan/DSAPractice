package com.twodArray;

public class MatrixRotation {
	
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4,3 }, { 5, 6, 7, 8 ,4}, { 9, 10, 11, 12, 7 }, { 13, 14, 15, 16, 7 } , {8,6,3,5,9}};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		matrix = matrixRotation(matrix, matrix.length, matrix[0].length);
		
		printMatrix(matrix);

		int[][] matrix2= { { 1, 2, 3, 4,3 }, { 5, 6, 7, 8 ,4}, { 9, 10, 11, 12, 7 }, { 13, 14, 15, 16, 7 } , {8,6,3,5,9}};
		
		matrix = transposeMatrix(matrix2);
		printMatrix(matrix2);
		
		matrix = swapMatirxColumns(matrix2);
		printMatrix(matrix2);
	}

	public static void printMatrix(int[][] matrix) {
		System.out.println();
		System.out.println("**********");
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] matrixRotation(int[][] matrix, int rows, int columns) {
		int[][] tmpMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// tmpMatrix[j][matrix.length-1] = matrix[j][matrix.length-1];
				// System.out.println(matrix[i][j] + " ");
				tmpMatrix[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// tmpMatrix[j][matrix.length-1] = matrix[j][matrix.length-1];
				// System.out.println(matrix[i][j] + " ");
				matrix[j][matrix.length - i - 1] = tmpMatrix[i][j];
			}
		}
		return matrix;
	}

	public static int[][] transposeMatrix(int[][] matrix) {
		int tmp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i >= j) {

				} else {
					tmp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = tmp;
				}
			}
		}
		return matrix;
	}

	public static int[][] swapMatirxColumns(int[][] matrix) {
		int tmp = 0;
		int reminder = matrix.length % 2;
		if (reminder == 0) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length/2; j++) {
					tmp = matrix[i][j];
					matrix[i][j] = matrix[i][matrix.length - j - 1];
					matrix[i][matrix.length - j - 1] = tmp;
				}
			}
		} else {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length / 2 +  1; j++) {
					tmp = matrix[i][j];
					matrix[i][j] = matrix[i][matrix.length - j - 1];
					matrix[i][matrix.length - j - 1] = tmp;
				}
			}
		}
		return matrix;
	}
}
