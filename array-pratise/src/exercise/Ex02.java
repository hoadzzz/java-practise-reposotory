package exercise;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		int[][] digits = { { 4, 2, 6, 7 }, 
						   { 3, 7, 0, 9 }, 
						   { 8, 0, 7, 3 }, 
						   { 1, 5, 0, 3 }, 
						   { 5, 3, 7, 4 } };

		int[][] result = new int[digits.length][digits[0].length];
		
		for (int i = 0; i < digits.length; i++) {
			for (int j = 0; j < digits[i].length; j++) {
				result[i][j] = digits[i][j];
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				if (digits[i][j] == 0) {

					for (int j2 = 0; j2 < result[i].length; j2++) {
						result[i][j2] = 0;
					}
					for (int j2 = 0; j2 < result.length; j2++) {
						result[j2][j] = 0;
					}
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			ArrayUtils.print(result[i]);
		}
		
	}
}
