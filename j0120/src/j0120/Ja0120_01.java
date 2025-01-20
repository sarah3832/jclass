package j0120;

public class Ja0120_01 {

	static int a = 10;  // 클래스 변수 : 객체선언 없이, 클래스명.변수명
	
	public static void main(String[] args) {
		// 객체선언
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		System.out.println("d : "+d);
		change(d);  // 같은 클래스 내에서는, 클래스명 생략가능
		System.out.println("d.x : "+d.x);

	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("d.x : "+d.x);
	}

}
