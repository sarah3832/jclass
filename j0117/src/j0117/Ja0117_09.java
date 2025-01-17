package j0117;

import java.util.Scanner;

public class Ja0117_09 {
	
	// 메서드
//	int add(int a, int b) {
//		int result = a+b;
//		return result; 
//	}
//	
//	boolean power;  // 인스턴스 변수 : 객체선언 후, 참조변수.변수명
//	void power() {
//		power = !power;
//	}
	
	// 메서드
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 기본형 매개변수 : 변수의 값을 읽기만 할 수 있음.
		// 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있음.
		
		// 2개의 값을 넘겨주면
		// 메서드 3개
		// a,b -> a,b 각각 10을 더해서 두수를 더하기해서 리턴
		// a,b -> a,b 각각 10을 곱해서 두수를 더하기해서 리턴
		// a,b -> a,b 곱해서 리턴
		
		// 입력이 -1 들어오면 프로그램 종료
		Cal2 c = new Cal2();
		while(true) {
			
			System.out.println("첫번째 숫자를 입력하세요.(-1.종료) >> ");
			int input = scan.nextInt();
			if (input == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("두번째 숫자를 입력하세요. >> ");
			int input2 = scan.nextInt();
			
			// 출력
			int result = c.add(input, input2);
			System.out.println("1번 : "+result);
			int result2 = c.mult(input, input2);
			System.out.println("2번 : "+result2);
			int result3 = c.mult2(input, input2);
			System.out.println("3번 : "+result3);
			
		}
		
		
		
// -------------------------------------------
		
//		Cal c = new Cal();  // 객체선언
//		
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기 : "+result);
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : "+result2);
//		
//		c.mult(num, num2);
	
// ---------------------------------------------		
		
		// 메서드 : 작업을 수행하기 위한 명령문의 집합
		// int add(int a, int b) : 리턴타입
		// void : 반환값이 없는 경우, 리턴타입 대신 사용
		
//		int a = 0;  // 지역변수
//		
//		// 객체선언
//	    Ja0117_09 j = new Ja0117_09();
//	    j.power = true;
//	    System.out.println(j.power);


	}

}
