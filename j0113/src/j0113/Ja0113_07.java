package j0113;

public class Ja0113_07 {

	public static void main(String[] args) {
		// 형변환
		int n1 = 48;
		char ch1 = (char)n1;  // int -> char : 강제 형변환, 변환하려는 타입을 붙혀줌.
		System.out.println(n1);  // 48
		System.out.println(ch1);  // 0 : 문자형
		
		char ch2 = 'a';
		int n2 = ch2;  // int 생략가능 (char -> int)
		System.out.println(n2);  // a = 97
		
		float f1 = 3.14f;
		int n3 = (int)f1;
		System.out.println(n3);  // sysout + 컨트롤 + 스페이스바 = 자동입력
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2);
		

	}

}
