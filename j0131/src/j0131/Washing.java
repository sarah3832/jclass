package j0131;

public class Washing extends Product {
	
	private int size;
	private String color;
	private String door;
	
	Washing(){
		this("LG 세탁기",900000,90000,300,"BLUE","CIRCLE");
	}
	
	public Washing(String name, int price, int point, int size, String color, String door) {
		setName(name);
		setPrice(price);
		setPoint(point);
		this.size = size;
		this.color = color;
		this.door = door;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}
	
	
	
	

}
