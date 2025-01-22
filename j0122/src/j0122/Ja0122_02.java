package j0122;

import java.util.Calendar;
import java.util.Date;

public class Ja0122_02 {

	public static void main(String[] args) {
		
		// 제어자의 조합
		// 메서드에 static과 abstract 함께사용 x
		// 클래스에 abstract과 final 동시사용x
		
		// 다형성 : 여러가지 형태를 가질 수 있는 능력
		// - 하나의 참조변수로 여러타입의 객체를 참조할 수 있는것
		// - 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있음.
		
// ---------------------------------------------		
		
		// Date = 각각 다른 시간을 사용할때
//		Date d = new Date();
//		System.out.println(d.toString());
//		Date d2 = new Date();
//		System.out.println(d2.toString());
//		
		// Calendar : 동일한 시간을 사용할때(공용)
//		Calendar c1 = Calendar.getInstance();
//		System.out.println(c1.getTime());
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c2.getTime());
		
// ----------------------------------------------		
		
		// 객체선언
		// 싱글톤 패턴 
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1 : "+s1.getNum());
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2 : "+s2.getNum());
		Singleton s3 = Singleton.getInstance();
		System.out.println("s3 : "+s3.getNum());
		Singleton s4 = Singleton.getInstance();
		System.out.println("s4 : "+s4.getNum());
		s1.setNum(100);
		System.out.println("s1의 num값 변경");
		System.out.println("s2 : "+s2.getNum());
		System.out.println("s4 : "+s4.getNum());

		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		Time t1 = new Time();
		
		// 관계가 없는 객체는 형변환 x (상속관계만 가능)
//		cc1 = (Car)t1;
		
		int a = 10;
		long b = 100;
		a = (int)b;
		
		
		
		
		
	}

}
