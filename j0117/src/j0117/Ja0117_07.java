package j0117;

public class Ja0117_07 {

	public static void main(String[] args) {
		Stu.count = 10;  // 클래스 변수 : 객체선언 없이, 클래스명.변수명
//		Stu.id = "aaa";  // 에러
		System.out.println("Stu.count : "+Stu.count);
		
		Stu s1 = new Stu();
		s1.count = 100;
		s1.id = "aaa";  // 인스턴스 변수 : 객체선언 후, 참조변수.변수명
		s1.pw = "1111";
		s1.name = "홍길동";
		s1.age = 100;
		System.out.println("s1 id : "+s1.id);
		System.out.println("s1 count : "+s1.count);
		System.out.println("s1 age : "+s1.age);
		System.out.println("---------------------");

		Stu s2 = new Stu();
		s2.id = "bbb";
		s2.count = 500;
		s2.age = 500;
		System.out.println("s2 id : "+s2.id);
		System.out.println("s2 count : "+s1.count);
		System.out.println("s2 age : "+s2.age);
		
	}

}
