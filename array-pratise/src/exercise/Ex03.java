package exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

import static java.util.Comparator.*;


public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		
		
		//Comparator<String> comparator = Comparator.nullsFirst(comparing(null));
		
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1 == null) {
					return -1;
				}
				if(o2 == null) {
					return 1;
				}
				if("Special".equals(o2)) {
					return -1;
				}
				if("Special".equals(o1)) {
					return 1;
				}
				return o1.compareTo(o2);
			}
		});
		
		ArrayUtils.print(strings);
		
	}
}
