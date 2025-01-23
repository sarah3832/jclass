package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		// 컴파일 에러 : 컴파일할 때 생기는 에러
		// 런타임 에러 : 실행할 때 생기는 에러
		// 에러는 어쩔 수 없지만, 예외는 처리해야 함.
		// 예외 처리방법 : try-catch
		// --------------------------------------
		
		try {
			// 정상적으로 돌아가는 프로그램 구현
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			throw new Exception("고의로 에러 발생");
//			System.out.println(3/0);  // 에러발생
		} catch(Exception e) {
			// 에러 발생시 실행되는 부분
			System.out.println(e.getMessage());
			e.printStackTrace();  // 에러구문(위치,설명) 확인법
			System.out.println("[[[ 에러발생 4-2 ]]]");
		}
		System.out.println(5);
		System.out.println(6);
		
		
// -------------------------------------------------
		
//		Scanner scan = new Scanner(System.in);
//		System.out.printn("안녕하세요.");  // 오타 - 컴파일에러
//		int[] n = new int[3];
//		for(int i=0;i<4;i++) {
//			System.out.println("숫자를 입력하세요.");
//			n[i] = scan.nextInt();  // 런타임에러
//		}

		
		
		
		
		
		
	}

}
