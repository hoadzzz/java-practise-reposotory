package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import bean.EnglishWord;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		Map<String, EnglishWord> dictionary = init();
		System.out.println("size : " + dictionary.size());
		addNewWord(dictionary, "money", new EnglishWord("money", "tien", "noun", "ko bao gio du"));
		System.out.println("size: " + dictionary.size());

		EnglishWord hello = lookup(dictionary, "hello");

		System.out.println(hello);

	}

	private static Map<String, EnglishWord> init() {
		Map<String, EnglishWord> result = new HashMap<>();

		result.put("hello", new EnglishWord("hello", "xin chao", "verb", null));
		result.put("pen", new EnglishWord("pen", "cay but", "noun", null));
		result.put("kich", new EnglishWord("kich", "da", "verb", null));
		result.put("table", new EnglishWord("table", "cai ban", "noun", null));
		result.put("she", new EnglishWord("she", "co ay", "pro", null));
		result.put("friendly", new EnglishWord("friendly", "than thien", "adv", null));
		result.put("cat", new EnglishWord("cat", "con meo", "noun", null));

		return result;

	}

	private static boolean addNewWord(Map<String, EnglishWord> dic, String key, EnglishWord value) {

		if (dic.containsKey(key)) {
			System.out.println("key must be not duplicate dictionary!");
			return false;
		}

		dic.put(key, value);
		System.out.println("add new word succession!!");

		return false;
	}

	private static EnglishWord lookup(Map<String, EnglishWord> dic, String key) throws Exception {

		Objects.requireNonNull(dic);

		if (!(dic.containsKey(key))) {
			throw new IllegalArgumentException("dic do not contain key");
		}

		return dic.get(key);

	}
}
