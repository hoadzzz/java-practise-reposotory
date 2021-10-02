package bean;

public class Item {
	private int storeId;
	private int itemId;
	private String name;
	private double price;
	
	

	public Item(int storeId, int itemI, String name, double price) {
		this.storeId = storeId;
		this.itemId = itemI;
		this.name = name;
		this.price = price;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemI) {
		this.itemId = itemI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [StoreId=" + storeId + ", itemI=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
