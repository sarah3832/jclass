package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class StuDeck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int choice=0,temp=0,count=0;
	
	// list 출력
	void listPrint() {
		System.out.println("                      [ 학생성적 출력 ]");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("-----------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}
	}
	
	
	// 파일 읽어오기
	void fileRead() throws Exception{
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		String name = "";
		double avg = 0;
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
		}
		br.close();
		fr.close();
	}
	
	
	// 학생성적 삭제
	void delete() {
		System.out.println("[ 학생성적 삭제 ]");
		System.out.println("삭제하고자 하는 학생을 입력하세요. >> ");
		String search = scan.next();
		int searchNo = 0;
		temp = 0;
		for(int i=0;i<list.size();i++) {
			if(search.equals(list.get(i).getName())) {
				temp = 1;
				searchNo = i;
				break;
			}
		} // for
		if(temp == 0) {
			System.out.println("검색하신 학생이 없습니다.");
		}else {
			System.out.println("학생을 정말로 삭제하겠습니까? (1.예 2.아니오)");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				list.remove(searchNo);
				System.out.println("학생이 삭제되었습니다.");
				break;
			case 2:
				System.out.println("삭제가 취소되었습니다.");
				break;
			} // switch
		}
	} // delete
	
	
	// 파일저장
	void fileSave() throws Exception {
		FileWriter fw = new FileWriter("c:/save/stu2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<list.size();i++) {
			list.get(i);
			String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",
					list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),
					list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),
					list.get(i).getAvg(),list.get(i).getRank());
			bw.write(str);
		}
		bw.close();
		fw.close();
		System.out.println("파일이 저장되었습니다.");
	} // fileSave
	
	
	
	
	
	// 학생성적 수정
//	void rere() {
//		System.out.println("[ 학생성적 수정 ]");
//		System.out.println("수정하고자 하는 학생을 입력하세요. >> ");
//		String search = scan.next();
//		int searchNo = 0;
//		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			if(search.equals(s.getName())) {
//				searchNo = i;  
//				temp = 1; 
//			}
//		}
//		Stu s = (Stu)list.get(searchNo);
//		if(temp == 0) {
//			System.out.println("검색하신 학생이 없습니다.");
//		}else {
//			System.out.println("삭제하고자 하는 과목을 선택하세요. >> ");
//			System.out.println("1. 국어성적");
//			System.out.println("2. 영어성적");
//			System.out.println("3. 수학성적");
//			choice = scan.nextInt();
//			switch(choice) {
//			case 1:
//				System.err.println("국어성적을 삭제 하시겠습니까? (1.예 2.아니오)");
//				choice = scan.nextInt();
//				switch(choice) {
//				case 1:
//					
//					System.out.printf("국어성적이 삭제되었습니다.");
//					break;
//				case 2:
//					System.out.println("국어성적 삭제를 취소합니다.");
//					break;
//				}
//				
//				break;
//			case 2:
//				System.out.printf("영어성적이 삭제되었습니다.");
//				break;
//			case 3:
//				System.out.printf("수학성적이 삭제되었습니다.");
//				break;
//			} // switch	
//		} // else 
//	} // rere
	
	
	
	
	
	
	
	
	

}
