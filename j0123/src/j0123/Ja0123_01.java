package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_01 {

	public static void main(String[] args) {
		// 학생성적 프로그램
		// 변수선언 - 번호,이름,국어,영어,수학,합계,평균
		Scanner scan = new Scanner(System.in);
		Stu_Deck sd = new Stu_Deck();  // 객체선언 
		int choice = 0;
		
		// 무한반복
		loop:while(true) {
			// 화면구현
			choice = sd.main_print();
			
			
			switch (choice) {
			
			case 1:
				sd.input();
				break;
					
			case 2:
				sd.output();
				break;
				
			case 3:
				sd.re();
				break;
			case 4:
				
				break;
				
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
				
				
			} // switch
			
		} // while loop

	}

}
