package sorting;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] digits = {3, 6, 3, 7, 2, 9, 8, 12, 5};
		sort(digits);
	}
	
	private static int[] sort(int[] numbers) {
		
		int[] result = Arrays.copyOfRange(numbers, 0, numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if(result[j] > result[j + 1]) {
					swap(result , j, j + 1);
				}
			}
		}
		
		return null;
	}

	private static void swap(int[] number, int a, int b) {
		int tmp =0;
		tmp = number[a];
		number[a] = number[b];
		number[b] = tmp;
	}
	
}
