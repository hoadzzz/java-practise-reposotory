package exercise;

import utils.ArrayUtils;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 5, 2, 6, 2, 6, 6, 7, 9, 1, 1, 3, 3};

		for (int i = 0; i < digits.length; i++) {
			boolean d = false;
			for (int j = i + 1; j < digits.length; j++) {
				if (digits[i] == digits[j]) {
					digits = remove(digits, j);
					d = true;
					j--;
				}
			}
			if (d) {
				digits = remove(digits, i);
				i--;
			}
		}

		ArrayUtils.print(digits);
	}

	private static int[] remove(int[] numbers, int index) {
		int[] result = new int[numbers.length - 1];
		for (int i = 0; i < result.length; i++) {
			if (i < index) {
				result[i] = numbers[i];

			}
			if (i >= index) {
				result[i] = numbers[i + 1];
			}
		}
		return result;
	}
}
