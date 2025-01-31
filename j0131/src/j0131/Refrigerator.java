package j0131;

public class Refrigerator extends Product {
	
	private int size;
	private int door;
	private String color;
	
	Refrigerator(){
		this("SAMSUNG 냉장고",1200000,120000,500,2,"WHITE");
	}

	public Refrigerator(String name, int price, int point, int size, int door, String color) {
		setName(name);
		setPrice(price);
		setPoint(point);
		this.size = size;
		this.door = door;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	

}
