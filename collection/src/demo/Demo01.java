package demo;

import collection.utils.MyArrayList;
import collection.utils.MyList;

public class Demo01 {
	public static void main(String[] args) {
		MyList<String> sequences = new MyArrayList<>();
		sequences.add("a");
		sequences.add("b");
		sequences.add("c");
		sequences.add("d");
		sequences.add("e");
		sequences.add("a");
		sequences.add("b");
		sequences.add("c");
		sequences.add("d");
		sequences.add("e");
		sequences.add("e");
		sequences.remove(5);
		
		sequences.show();
		System.out.println(sequences.size());
	}
}
