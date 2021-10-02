package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class QuickSort {
	public static void main(String[] args) {
		int[] digits = {1, 5, 3, 6, 8, 4, 9, 3, 2};
		
		Arrays.sort(digits);
		ArrayUtils.print(digits);
	}
}
