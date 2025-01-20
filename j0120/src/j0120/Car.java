package j0120;

public class Car {
	
	Car(){
		this("black","auto",4);  // this : 인스턴스 자신을 가리키는 참조변수
		door = 5;  // 밑에 적어야함
	}
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType =  c.gearType;
		door = c.door;
	}
	
	String color;
	String gearType;
	int door;

}
