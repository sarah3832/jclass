package j0124;

public class Ja0124_03 {

	public static void main(String[] args) {
		// 프로세스 : 실행 중인 프로그램, 자원과 쓰레드로 구성
		// 쓰레드 : 2가지 - 싱글쓰레드, 멀티쓰레드 
		//----------------------------------------
		
		// 멀티쓰레드 : for문 동시에 실행
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		th1.start();
		th2.start();
		
		
//		// 싱글쓰레드 : for문 하나가 끝나야 다음 for문 시작
//		for(int i=0;i<300;i++) {
//			System.out.println("i : "+i);
//		}
//		for(int j=0;j<300;j++) {
//			System.out.println("j : "+j);
//		}
		
		
		
		
		
		
		
		

	}

}
