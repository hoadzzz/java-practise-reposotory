package sorting;

import bean.Item;
import utils.ArrayUtils;

public class SortObject {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if(items[j].getItemId() > items[j + 1].getItemId()) {
					Item tmp = null;
					tmp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = tmp;
				}
			}
		}
		
		ArrayUtils.println(items);
		
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, 12, "a", 27d),
				new Item(2, 27, "B", 12d),
				new Item(3, 12, "c", 27d),
				new Item(2, 29, "D", 25d),
				new Item(1, 18, "f", 27d),
				new Item(1, 10, "K", 19d),
				new Item(4, 12, "B", 27d)
		};
	}
}
