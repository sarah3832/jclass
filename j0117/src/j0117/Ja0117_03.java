package j0117;

public class Ja0117_03 {
	
	int num;

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();

		Tv[] t = new Tv[3];  // 배열선언 : 같은타입만 넣을 수 있음.
		
		
// --------------------------------------
		
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		t1.channel = 7;
//		System.out.println("t1 채널 : "+t1.channel);
//		t2.channel = 9;
//		System.out.println("t2 채널 : "+t2.channel);
//		
//		t2 = t1;  // 얕은복사
//		t2.channel = 100;
//		t1.channel = 50;
//		System.out.println(t1.channel);
//		System.out.println(t2.channel);
	
// --------------------------------------				
		
		// 메서드 안 지역변수 : 값이 할당되지 않으면 사용할 수 없음.
//		int a;
//		int b = 10;
//		a = b;
//		System.out.println(a);  // 값이 할당됨
//		
//		Tv t3 = new Tv();
//		System.out.println(t3.channel);
		
//		int[] arr = new int[5];
//		System.out.println(arr);
//		System.out.println(a);
		
// --------------------------------------		
		
		// 객체생성(객체선언)
		// 흰색, false, 7
		// 검정, true, 10
//		Tv t = new Tv();
//		Tv t2 = new Tv();
//		
//		t.color = "white";
//		t.power = false;
//		t.channel = 7;
//		t2.color = "black";
//		t2.power = true;
//		t2.channel = 10;
//		
//		System.out.println(t.color);
//		System.out.println(t.power);
//		System.out.println(t.channel);
//		System.out.println(t2.color);
//		System.out.println(t2.power);
//		System.out.println(t2.channel);

		

	}

}
