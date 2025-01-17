package j0117;

public class Ja0117_01 {

	public static void main(String[] args) {
		// 객체 : 클래스의 복사본 / 변수와 메서드로 이루어짐
		// 클래스 : 객체를 정의해 놓은 것 / 객체를 생성하는데 사용
		// 인스턴스 생성방법 : 참조변수명 = new 클래스명();
		
		Tv t1 = new Tv();  // t1 - 참조변수
		t1.color = "red";  
		t1.power = false;
		t1.channel = 7;
		
		t1.power();
		t1.channelUP();
		
		System.out.println("현재채널 : "+t1.channel);
		
		
		
		
		
		

	}

}
