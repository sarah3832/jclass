package j0120;

import java.util.Scanner;

public class Ja0120_11 {

	public static void main(String[] args) {
		// 배열X, 객체사용
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10];
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		int[] score = new int[3];
		String name = "";
		double avg = 0;
		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0, count = 0, temp = 0;
		
		
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1.학생성적 입력");
			System.out.println("2.학생성적 출력");
			System.out.println("3.학생성적 수정");
			System.out.println("4.등수처리");
			System.out.println("0.프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적 입력 ]");
				while(count<10) {
					System.out.printf("[ %d번째 ]\n",count+1);
					// 이름
					System.out.println("학생이름 입력(0.이전으로) >> ");
					name = scan.next();
					if(name.equals("0")) {
						break;
					}
					// 점수
					for(int i=0;i<score.length;i++) {
						System.out.printf("%s점수를 입력하세요. >> ",title[i+2]);
						score[i] = scan.nextInt();
					}
					s[count] = new Stuscore(name,score[0],score[1],score[2]);
					s[count].print();
					System.out.println("학생성적이 저장되었습니다.");
					
					count++;
				}
				break;
				
			case 2:
				System.out.println("[ 학생성적 출력 ]");
				System.out.println("                      [ 학생성적 ]");
				System.out.println("------------------------------------------------------");
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s\t",title[j]);
				}
				System.out.println();
				System.out.println("------------------------------------------------------");
				for(int j=0;j<count;j++) {
					System.out.printf("%d\t",s[j].no);
					System.out.printf("%s\t",s[j].name);
					System.out.printf("%d\t",s[j].kor);
					System.out.printf("%d\t",s[j].eng);
					System.out.printf("%d\t",s[j].math);
					System.out.printf("%d\t",s[j].total);
					System.out.printf("%.2f\t",s[j].avg);
					System.out.printf("%d\n",s[j].rank);
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("수정하고자 하는 학생이름 입력 >> ");
				String nameInput = scan.next();
				
				temp = 0;
				int search = 0;
				for(int j=0;j<count;j++) {
					if(nameInput.equals(s[j].name)) {
						search = j;
						temp = 1;
					}
				}
				if(temp == search ) {
					System.out.printf("%s학생을 찾았습니다!",nameInput);
					System.out.println("[ 수정 과목선택 ]");
					System.out.println("1.국어 ");
					System.out.println("2.영어 ");
					System.out.println("3.수학 ");
					choice = scan.nextInt();
					
					switch(choice) {
					case 1: 
						System.out.println("[ 국어점수 수정 ]");
						System.out.printf("현재 국어점수 : %d \n",s[search].kor);
						System.out.println("변경 국어점수 : ");
						s[search].kor = scan.nextInt();
						break;
						
					case 2:
						System.out.println("[ 영어점수 수정 ]");
						System.out.printf("현재 영어점수 : %d \n",s[search].eng);
						System.out.println("변경 영어점수 : ");
						s[search].eng = scan.nextInt();
						break;
						
					case 3:
						System.out.println("[ 수학점수 수정 ]");
						System.out.printf("현재 수학점수 : %d \n",s[search].math);
						System.out.println("변경 수학점수 : ");
						s[search].math = scan.nextInt();
						break;	
					}
					s[search].total = s[search].kor+s[search].eng+s[search].math;
					s[search].avg = s[search].total/3.0;

				}else {
					System.out.println("검색하신 학생을 찾지 못했습니다.");
				}
				break;
			
			case 4:
				System.out.println("[ 등수처리 ]");
				for(int j=0;j<count;j++) {
					rank = 1;
					for(int k=0;k<count;k++) {
						if(s[j].total < s[k].total) {
							rank++;
						}
					}
					s[j].rank = rank;
				}
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
				
				
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
				
			}
		}
		
		
		
		

	}

}
