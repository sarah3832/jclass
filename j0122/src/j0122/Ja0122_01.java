package j0122;

import stu.Shape;

public class Ja0122_01 {

	public static void main(String[] args) {
		// 오버라이딩 : 재정의 하는 것.(상속일때만 가능)
		
		// 접근제어자 : 멤버 또는 크래스에 사용, 외부로부터 접근제한
		// 사용이유 - 외부로부터 데이터를 보호하기 위해
		// private - 같은 클래스 내에서만 접근가능
		// default - 같은 클래스,패키지 내에서는 접근가능
		// protected - 같은 패키지 내에서와 다른 패키지의 자손클래스에서 접근가능
		// public - 접근제한 전혀없음 (클래스에만 가능)
		
		// 생성자의 접근제어자 : 일반적으로 클래스의 접근제어자와 일치
		
		// ------------------------------------------------------
		
		Time t1 = new Time(12,05,10);
//		System.out.println(t1.getHour());
//		t1.setHour(t1.getHour()+1);
//		System.out.println(t1.getHour());
		
		// 17,35,30
		t1.setHour(t1.getHour()+5);
		System.out.println(t1.getHour());
		t1.setMinute(t1.getMinute()+30);
		System.out.println(t1.getMinute());
		t1.setSecond(t1.getSecond()+20);
		System.out.println(t1.getSecond());
		System.out.printf("시간 : %d:%d:%d\n",t1.getHour(),t1.getMinute(),t1.getSecond());
		
		
		
// ---------------------------------------------------		
		
//		Car c = new Car();
//		System.out.println(c.getColor());
//		Car c2 = new Car("white","auto",5); 
//		System.out.println(c2.getColor());
//		c2.setDoor(-50);
//		System.out.println(c2.getDoor());
//		
//		Shape s = new Shape();
		
		
		
		
		
		

	}

}
