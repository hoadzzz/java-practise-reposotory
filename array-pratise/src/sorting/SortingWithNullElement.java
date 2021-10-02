package sorting;

import java.util.Arrays;

import utils.ArrayUtils;

public class SortingWithNullElement {
	public static void main(String[] args) {
		// null first

		String[] sequences = { "b", null, "a", "C", null, null, "c", "A" };
		
		String[] result = sortNull(sequences);
		
		ArrayUtils.print(result);

	}
	
	private static String[] sortNull(String[] sequences) {
		
		String[] result = Arrays.copyOfRange(sequences, 0, sequences.length);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length - i - 1; j++) {
				if(result[j] == null) {
					continue;
				}
				if(result[j + 1] == null) {
					swap(result, j, j + 1);
					continue;
				}
				
				if(result[j].compareTo(result[j + 1]) > 0) {
					swap(result, j, j + 1);
				}
				
			}
		}
		
		return result;
	}

	

	private static void swap(String[] sequences, int a, int b) {
		String tmp = null;
		tmp = sequences[a];
		sequences[a] = sequences[b];
		sequences[b] = tmp;
	}
}
