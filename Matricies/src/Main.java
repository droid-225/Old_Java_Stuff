import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = -10;
		matrix[0][1] = -5;
		matrix[0][2] = -6;
		matrix[1][0] = -7;
		matrix[1][1] = 0;
		matrix[1][2] = 7;
		matrix[2][0] = -9;
		matrix[2][1] = -7;
		matrix[2][2] = 8;
		
		
		printMatrix(matrix);
		
	}
	
	public static void printMatrix(int[][] matrix) { // prints matrix
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(j == 0 && matrix[i][j] >= 0)
					System.out.printf("%+2d", matrix[i][j]);
				else if (j > 0 && matrix[i][j] >= 0)
					System.out.print("  " + matrix[i][j]);
				else if (j > 0 && matrix[i][j] < 0)
					System.out.print(" " + matrix[i][j]);
				else 
					System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void swapRows(int[][] matrix, int row1, int row2) { // swaps rows
		int[] tempRow1 = {0,0,0};
		int[] tempRow2 = {0,0,0};
		for(int i = 0; i < matrix.length; i++) { // puts needed rows in temporary place
			if(i == (row1 - 1)) {
				tempRow1 = matrix[i];
			}
			else if(i == (row2 - 1)) {
				tempRow2 = matrix[i];
			}
		}
		for(int i = 0; i < matrix.length; i++) { // assigns rows to required index
			if(i == (row1 - 1)) {
				matrix[i] = tempRow2;
			}
			else if(i == (row2 - 1)) {
				matrix[i] = tempRow1;
			}
		}
	}
	
	public static void rowDivide(int[][] matrix, int rowNum, int divisor) { // divides row by a constant
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(i == (rowNum - 1)) {
					matrix[i][j] /= divisor;
				}
			}
		}
	}
	
	public static void rowSubtract(int[][] matrix, int rowNum, int[] subRow) { // performs row subtraction
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(i == (rowNum - 1)) {
					//matrix[i][j] /= divisor;
				}
			}
		}
	}

}
