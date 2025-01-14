package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		// 정수형 - byte, short 거의 사용안함. / 기본형 정수 int - 값 입력
		// 정수형 - long : 접미사 L 붙혀야 함.
		// 실수형 - float, double / float - 접미사 F, double - D 생략가능.
		
		// 16진수 표기법
		// char - ''표시
		char ch2 = '\u0041';  // 16*4 + 1*1 = 64+1 = 65
		System.out.println(ch2);

		char ch3 = 97;  // 아스키 코드값 : 97 = a / 48 = 0 / 65 = A
		System.out.println(ch3);
		
		char ch4 = '\t';  // tab 키
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		// *****************************
		
		// boolean - true, false : 소문자
		boolean p = true;
		boolean p2 = false;
		
		long l = 1000000000L;  // long 은 L 붙혀야 함.
		
		float f = 3.14F;  // 일부로 F 붙힘.
		float f2 = 100F;
		
		double d = 3.14;  // D 생략가능
	}

}
