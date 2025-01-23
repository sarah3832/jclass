package j0123;

public class Ja0123_04 {

	public static void main(String[] args) {
		// 메서드에 예외 선언하기 : 예외를 처리하는 또 다른방법
		// finally : 무조건 실행시킴
		// 'try-catch' or 'throws Exception' 사용해야 에러안남 
		
		System.out.println("프로그램 실행");
		System.out.println(1);
		try {
			method1();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(7);
		System.out.println(8);
		System.out.println("프로그램 종료");
		
	} // main
	
	static void method1() throws Exception {
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0);  // 에러발생
		System.out.println(4);
		System.out.println(5);
		System.out.println("무조건 실행");
		System.out.println(6);
	}
	
//	static void method1() {
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(4/0);  // 에러발생
//			System.out.println(4);
//		} catch (Exception e) {
//			System.out.println(5);
//		}finally {
//			System.out.println("무조건 실행");
//		}
//		System.out.println(6);
//	}

} // class
