package j0121;

public class Ja0121_01 {  // extends
	
	public static void main(String[] args) {
		// [ 상속 ] - extends 사용 
		// 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것.
		// 두 클래스를 조상과 자손으로 관계를 맺어주는 것.
		// 자손은 조상의 모든 멤버를 상속받음.(생성자,초기화블럭 제외)
		// 자손의 멤버개수는 조상보다 적을 수 없음.(같거나 많음)
		
		// [ 클래스의 관계 ]
		// 상속관계 : 공통부분은 조상에서 관리, 개별부분은 자손에서 관리
		// 조상의 변경 -> 자손에 영향 / 자손의 변경 -> 조상에 아무런 영향 x

		// 포함관계 : 한 클래스의 멤버변수로 다른 클래스를 선언하는 것. 
		// -----------------------------------------------------
		
		// point[] p : 3개의 꼭지점 필요, 넓이를 구할려면
		Point[] p = new Point[3];
		p[0] = new Point(100,100);
		p[1] = new Point(140,50);
		p[2] = new Point(200,100);
		Triangle t1 = new Triangle(p);  // 밑에랑 동일
//		Triangle t1 = new Triangle(p[0],p[1],p[2]);
		t1.draw();
		
//  	int[] arr = {1,2,3};
//		Point[] p = {new Point(100,100), new Point(140,50), new Point(200,100)};
//		// 방법2
//		int[] arr3 = new int[] {1,2,3};
//		// 방법3
//		int[] arr2 = new int[3];
//		arr2[0] = 1;
//		arr2[1] = 2;
//		arr2[2] = 3;
		
// -----------------------------------------------------------
		
//		Circle c1 = new Circle();
//
//		// 원 넓이 = 반지름*반지름*3.14
//		double di = c1.r*c1.r*3.14;
//		System.out.println("넓이 : "+di);
//		c1.draw();
//		
////		Circle(Point center, int r)
////		Point center = new Point(150,150);
//		Circle c2 = new Circle(new Point(150,150),50);
//		double di = c1.r*c1.r*3.14;
//		System.out.println("넓이 : "+di);
//		c1.draw();
		
// -----------------------------------------------------------
		
//		Circle c = new Circle();
//		c.x = 100;
//		System.out.println(c.x);
		
		
		// 객체선언 - 포함관계
//		Point p = new Point();
//		p.x = 10;
//		p.y = 5;
//		System.out.println(p.x);
//		System.out.println(p.y);
		
		
		
	}

}
