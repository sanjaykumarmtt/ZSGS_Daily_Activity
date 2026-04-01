package Encapsulation;

public class SmartPhone {
	
	private String brand;
	private String model;
	private int storageCapacity;
	
	public SmartPhone(String brand, String model, int storageCapacity) {
		this.brand = brand;
		this.model = model;
		this.storageCapacity = storageCapacity;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	public void increaseStorage(int addStorage) {
		if(addStorage>0) {
			this.storageCapacity=addStorage;
			System.out.println("---///Storage increased by: "+addStorage+"///----");
		}else {
			System.out.println("----XXXX Invalue Storage Value XXXX---- ");
		}
	}
	

}
