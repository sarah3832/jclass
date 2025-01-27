package j0127;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 1. ball 객체
		// 2. ball_deck 객체 
		// ( ball 45개 생성, ball 숫자입력/ ball 섞기, 6개 로또번호 추출, 6개 숫자입력, 로또번호와 입력번호 비교, 출력화면이 있음 )
		// 3. main 에서 로또 프로그램을 실행해서
		// 6개 숫자입력, 로또번호와 비교해서 몇개를 맞췄는지 확인
		Scanner scan = new Scanner(System.in);
		Ball_deck bd = new Ball_deck();
		
		loop:while(true) {
			System.out.println("       [ 로또 프로그램 ]");
			System.out.println("***************************");
			System.out.println("1. 로또번호 생성하기");
			System.out.println("2. 로또번호 섞기");
			System.out.println("3. 로또번호 추출");
			System.out.println("4. 숫자 입력하기");
			System.out.println("5. 결과");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("로또번호가 생성되었습니다.");
				// ball 45개생성
				bd.ball();
				break;
			case 2:
				// ball 섞기
				System.out.println("로또번호가 섞였습니다.");
				bd.ball_shake();
				break;
			case 3:
				// 6개 로또번호 추출
				System.out.println("로또번호가 추출되었습니다.");
				bd.ball_in();
				break;
			case 4:
				// 6개 숫자입력
				bd.ball_input();
				break;
			case 5 :
				// 로또번호와 입력번호 비교
				bd.ball_w();
				// 출력
				bd.ball_final();
				break;
			default :
				System.out.println("프로그램을 종료합니다.");
				break loop;
				
			} // switch
		} // while

		
		
		
		
		
		
		
		
		
		
		
	} // class

} // main
