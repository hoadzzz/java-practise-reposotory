package bean;

public class Device {
	private String serial;
	private String os;
	private String color;
	private int price;
	
	public Device() {
	}

	public Device(String serial, String os, String color, int price) {
		this.serial = serial;
		this.os = os;
		this.color = color;
		this.price = price;
	}


	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Device [serial=" + serial + ", os=" + os + ", color=" + color + ", price=" + price + "]";
	}
	
}
