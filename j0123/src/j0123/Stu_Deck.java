package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no=0,kor=0,eng=0,math=0,total=0,rank=0;
	String name = "";
	double avg = 0;
	int choice = 0,temp = 0,rankC = 0;  // 번호선택, 검색확인, 등수확인
	
	// 1.상단메뉴 메서드
	int main_print() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 등수 처리");
		System.out.println("0. 종료");
		System.out.println("---------------------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		return choice;
	} 
	
	// 2.입력 메서드	
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		// 입력
		while(true) {
			// 번호
			System.out.printf("[ %d번째 ]\n",list.size()+1);
			// 이름
			System.out.println("이름을 입력하세요. (0.이전페이지)");
			name = scan.next();
			// 0번인지 확인
			if(name.equals("0")) {
				break;
			}
			// 국어,영어,수학
			System.out.printf("국어점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.out.printf("영어점수를 입력하세요.\n");
			eng = scan.nextInt();
			System.out.printf("수학점수를 입력하세요.\n");
			math = scan.nextInt();
			
			// list 저장
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s 학생이 저장되었습니다.\n",name);
			} // while
	}

	
	// 3.출력 메서드
	void output() {
		System.out.println("[ 학생성적 출력 ]");
		// 출력
		System.out.println("                         [ 학생성적 ]");
		System.out.println("------------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for(int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j);  // Object 타입 -> 형변환 
			System.out.printf("%d\t",s.getNo());  // private 상태라 getNo()로 가져옴
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
		System.out.println();
	}
	
	// 4.수정 메서드
	void re() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("수정하고자 하는 학생을 입력하세요. >> ");
		String search = scan.next();
		int searchNo = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			if(search.equals(s.getName())) {
				searchNo = i;  // 위치값
				temp = 1;  // 검색이 있음
			}
		}
		Stu s = (Stu)list.get(searchNo);
		if(temp == 0) {
			System.out.println("검색하신 학생을 찾지 못했습니다.");
		}else {
			System.out.println("1. 국어점수");
			System.out.println("2. 영어점수");
			System.out.println("3. 수학점수");
			System.out.println("수정하고자 하는 과목을 선택하세요. >> ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("[ 국어점수 수정 ]");
				System.out.printf("현재 국어점수 : %d \n",s.getKor());
				System.out.println("변경 국어점수 입력 >> ");
				kor = scan.nextInt();
				break;
			case 2:
				System.out.println("[ 영어점수 수정 ]");
				System.out.printf("현재 영어점수 : %d \n",s.getEng());
				System.out.println("변경 영어점수 입력 >> ");
				eng = scan.nextInt();
				break;
			case 3:
				System.out.println("[ 수학점수 수정 ]");
				System.out.printf("현재 수학점수 : %d \n",s.getMath());
				System.out.println("변경 수학점수 입력 >> ");
				math = scan.nextInt();
				break;
			} // switch
			total = kor+eng+math;
			avg = total/3.0;
		}
	}
	
	
	
	
}
