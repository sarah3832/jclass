package j0124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int choice=0,temp=0,count=0;
		StuDeck stuDeck = new StuDeck();
		
		// 파일 읽어오기
		stuDeck.fileRead();
		
		// list 출력
		
		
		loop:while(true) {
			
			System.out.println("------------------------------");
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("------------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 삭제");
			System.out.println("5. 학생성적 검색");
			System.out.println("6. 학생등수 정렬");
			System.out.println("7. 학생이름 정렬");
			System.out.println("8. 등수처리");
			System.out.println("9. 파일 저장하기");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------------");
	
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:  // 학생성적 입력
				break;
				
			case 2:  // 학생성적 출력
				stuDeck.listPrint();
				break;
				
			case 3:
				break;
				
			case 4:
				stuDeck.delete();
				break;
				
			case 9:
				stuDeck.fileSave();
				break;
				
			default:
				break loop;
				
			} // switch
		
		} // while
		
		
		
		
		
		
		
	} // main

} // class
