package j0121;

public class Point {
	
	Point(){this(0,0);}  // this - 다른 생성자 (매개변수가 2개있는 생성자)
	Point(int x,int y){
			this.x = x;  // this - 인스턴스 변수
			this.y = y;
	}
	
	
	int x;  // 인스턴스 변수 : 객체선언 후, 참조변수명.변수명
	int y;

}
