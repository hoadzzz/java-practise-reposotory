package exercise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

public class Ex05 {
	public static void main(String[] args) {
		Map<String, Double> expenditures = new HashMap<>();

		expenditures.put("tien nha", 600d);
		expenditures.put("tien dien", 200d);
		expenditures.put("tien nuoc", 100d);
		expenditures.put("tien an", 1000d);
		expenditures.put("tien xang", 300d);
		expenditures.put("hoc phi", 400d);
		
		Map<String, Double> a = sortByKey(expenditures);
		
		for (Entry<String, Double> entry : a.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println("=====================================");
		
		Map<String, Double> b = sortByValue(expenditures);
		
		for (Entry<String, Double> entry : b.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println("=====================================");
		
		Map<String, Double> greater500 = filter(expenditures, t -> t >= 300d);
		for (Entry<String, Double> entry : greater500.entrySet()) {
			System.out.println(entry);
		}

	}

	private static Map<String, Double> filter(Map<String, Double> maps, Predicate<Double> p) {

		Set<Entry<String, Double>> entryList = maps.entrySet();
		Map<String, Double> result = new HashMap<>();
		
		for (Entry<String, Double> entry : entryList) {
			if (p.test(entry.getValue())) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		return result;

	}
	
	private static Map<String, Double> sortByKey(Map<String, Double> input){
		
		List<Entry<String, Double>> sortKeys = new LinkedList<>(input.entrySet());
		
		Map<String, Double> result = new LinkedHashMap<>();
		
		sortKeys.sort(Entry.comparingByKey());
		
		for (Entry<String, Double> entry : sortKeys) {
			result.put(entry.getKey(), entry.getValue());
		}
		
		return result;
		
	}
	private static Map<String, Double> sortByValue(Map<String, Double> input){
		
		List<Entry<String, Double>> sortKeys = new LinkedList<>(input.entrySet());
		
		Map<String, Double> result = new LinkedHashMap<>();
		
		sortKeys.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		
		for (Entry<String, Double> entry : sortKeys) {
			result.put(entry.getKey(), entry.getValue());
		}
		
		return result;
		
	}
}
