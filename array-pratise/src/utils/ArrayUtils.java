package utils;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void print(int[] elements) {
		for (int element : elements) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	
	public static <T> void print(T[] elenments) {
		for (T t : elenments) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
	public static <T> void println(T[] elenments) {
		for (T t : elenments) {
			System.out.println(t);
		}
	}
	
	
}
