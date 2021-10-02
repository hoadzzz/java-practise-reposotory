package bean;

public class Custumer {
	private String name;
	private String phoneNumber;
	private String id;
	private String address;
	
	//empty constructor
	public Custumer() {
	}
	//constructor
	public Custumer(String name, String phoneNumber, String id, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Custumer [name=" + name + ", phoneNumber=" + phoneNumber + ", id=" + id + ", address=" + address + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (!(obj instanceof Custumer)) {
			return false;
		}
		Custumer that = (Custumer) obj;
		return this.getId().equals(that.getId());
	}	

}
