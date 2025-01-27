package j0127;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		Stu_deck sd = new Stu_deck();
		
		loop:while(true) {
			System.out.println("         [ 학생성적 프로그램 ]");
			System.out.println("------------------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 삭제");
			System.out.println("5. 학생 검색");
			System.out.println("6. 학생등수 정렬");
			System.out.println("7. 학생이름 정렬");
			System.out.println("8. 등수처리");
			System.out.println("9. 파일 저장하기");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				// 학생성적 입력
				sd.s_input();
				break;
				
			case 2:
				// 학생성적 출력
				sd.s_print();
				break;
				
			case 3:
				// 학생성적 수정
				sd.s_re();
				break;
				
			case 4:
				// 학생성적 삭제
				sd.s_delete();
				break;
				
			case 5:
				// 학생 검색
				sd.s_search();
				break;
				
			case 6:
				// 학생 등수정렬
				sd.s_sort();
				break;
				
			case 7:
				// 학생 이름정렬
				sd.name_sort();
				break;
				
			case 8:
				// 등수처리
				sd.s_rank();
				break;
				
			case 9:
				// 파일 저장하기
				sd.s_save();
				break;
				
			default:
				break loop;
				
				
				
			} // switch

		} // while
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // class
