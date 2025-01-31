package stuproject;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		StuDeck sd = new StuDeck();

		loop:while(true) {
			System.out.println();
			System.out.println("-------------------------");
			System.out.println("     [ 학생성적프로그램 ]");
			System.out.println("-------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 삭제");
			System.out.println("5. 학생성적 검색");
			System.out.println("6. 학생등수 정렬");
			System.out.println("7. 학생이름 정렬");
			System.out.println("8. 등수 처리");
			System.out.println("9. 파일 저장");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				sd.sInput();
				break;
				
			case 2:
				sd.sPrint();
				break;
				
			case 3:
				sd.sResave();
				break;
				
			case 4:
				sd.sDelete();
				break;
				
			case 5:
				sd.sSearch();
				break;
				
			case 6:
				sd.sSort();
				break;
				
			case 7:
				sd.sNsort();
				break;
				
			case 8:
				sd.sRank();
				break;
				
			case 9:
				sd.sSave();
				break;
				
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
				
			} // switch
		} // while
		
		
	} // main

} // class
