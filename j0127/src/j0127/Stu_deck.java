package j0127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Stu_deck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int choice=0,temp=0,count=0,rankC=0;

	// 파일 읽어오기
	Stu_deck() throws Exception{
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
	
	
	// 학생성적 입력
	void s_input() {
		System.out.println("[ 학생성적 입력 ]");
		while(true) {
			System.out.printf("%d번째 학생이름을 입력하세요.(0.이전페이지) ",list.size()+1);
			String name = scan.next();
			if(name.equals("0")) {
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s학생 성적이 저장되었습니다.\n",name);
		} // while
	}
	
	
	// 학생성적 출력
	void s_print() { 
		System.out.println("                      [ 학생성적 출력 ]");
		System.out.println("------------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		} // for
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for(int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j);		
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		} // for
		System.out.println();
	}
	
	
	// 학생성적 수정
	void s_re() {
		System.err.println("[ 학생성적 수정 ]");
		System.out.println("성적을 수정하고자 하는 학생을 입력하세요. >> ");
		String search = scan.next();
		int searchNo = 0;
		temp = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())) {
				searchNo = i;
				temp = 1;
			}
		}
		Stu s = (Stu)list.get(searchNo);
		if(temp == 0) {
			System.out.println("입력하신 학생을 찾을 수 없습니다.");
		}else {
			System.out.println("1. 국어점수");
			System.out.println("2. 영어점수");
			System.out.println("3. 수학점수");
			System.out.println("수정하실 과목을 선택하세요. >> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.printf("현재 국어점수 : %d\n",s.getKor());
				System.out.println("변경 국어점수 입력 >> ");
				int kor = scan.nextInt();
				list.get(searchNo).setKor(kor);
				break;
			case 2:
				System.out.printf("현재 영어점수 : %d\n",s.getEng());
				System.out.println("변경 영어점수 입력 >> ");
				int eng = scan.nextInt();
				list.get(searchNo).setEng(eng);
				break;
			case 3:
				System.out.printf("현재 수학점수 : %d\n",s.getMath());
				System.out.println("변경 수학점수 입력 >> ");
				int math = scan.nextInt();
				list.get(searchNo).setMath(math);
				break;
			} // switch
			System.out.println("성적 수정이 완료되었습니다.");
			int total = s.getKor()+s.getEng()+s.getEng();
			double avg = total/3.0;
			list.get(searchNo).setTotal(total);
			list.get(searchNo).setAvg(avg);
		}
	}
	
	
	// 학생성적 삭제
	void s_delete() {
		System.out.println("[ 학생성적 삭제 ]");
		System.out.println("삭제하실 학생을 입력하세요. >> ");
		String search = scan.next();
		int searchNo = 0;
		temp = 0;
		for(int i=0;i<list.size();i++) {
			if(search.equals(list.get(i).getName())) {
				temp = 1;
				searchNo = i;
				break;
			} // if
		} // for
		if(temp == 0) {
			System.out.println("입력하신 학생을 찾을 수 없습니다.");
		}else {
			System.out.printf("정말로 %s 학생을 삭제하시겠습니까? (1.예 2.아니오) ",search);
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				list.remove(searchNo);
				System.out.printf("%s 학생이 삭제되었습니다.\n",search);
				break;
			case 2:
				System.out.println("학생 삭제를 취소합니다.");
				break;
			} // switch
		}
	}
	
	
	// 학생 검색
	void s_search() {
		System.out.println("[ 학생 검색 ]");
		System.out.println("찾고자하는 학생을 입력하세요. >> ");
		String search = scan.next();
		int searchNo = 0;
		temp = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())) {
				searchNo = i;
				temp = 1;
				break;
			} // if
		} // for
		Stu s = (Stu)list.get(searchNo);
		if(temp == 0) {
			System.out.println("입력하신 학생을 찾을 수 없습니다.");
		}else {
			System.out.printf("%s 학생을 찾았습니다!\n",search);
			System.out.printf("                      [ %s 학생 성적 ]\n",search);
			System.out.println("------------------------------------------------------------");
			for(int j=0;j<title.length;j++) {
				System.out.printf("%s\t",title[j]);
			} // for
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
						s.getTotal(),s.getAvg(),s.getRank());
			System.out.println();
		}
	}
	
	
	// 학생 등수정렬
	void s_sort() {
		System.out.println("[ 학생 등수정렬 ]");
		System.out.println("1. 등수 순차정렬");
		System.out.println("2. 등수 역순정렬");
		System.out.println("원하는 번호를 입력하세요. >> ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s1.getRank() - s2.getRank();
				}
			});
			System.out.println("학생등수 순차정렬을 완료하였습니다.");
			break;
		case 2:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s2.getRank() - s1.getRank();
				}
			});
			System.out.println("학생등수 역순정렬을 완료하였습니다.");
			break;
		} // switch
	}
	
	
	// 학생 이름정렬
	void name_sort() {
		System.out.println("[ 학생 이름정렬 ]");
		System.out.println("1. 이름 순차정렬");
		System.out.println("2. 이름 역순정렬");
		System.out.println("원하는 번호를 입력하세요. >> ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s1.getName().compareTo(s2.getName());
				}
			});
			System.out.println("학생이름 순차정렬이 완료하였습니다.");
			break;
		case 2:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s2.getName().compareTo(s1.getName());
				}
			});
			System.out.println("학생이름 역순정렬이 완료되었습니다.");
			break;
		}
	}
	
	
	// 등수처리
	void s_rank() {
		System.out.println("[ 등수처리 ]");
		for(int i=0;i<list.size();i++) {
			rankC = 1;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).getTotal() < list.get(j).getTotal()) {
					rankC++;
				} // if
			}list.get(i).setRank(rankC);
		}
		System.out.println("등수처리가 완료되었습니다.");
	}
	
	
	// 파일 저장하기
	void s_save() throws Exception {
		FileWriter fw = new FileWriter("c:/save/stu3.txt");
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
	}
	
		


	
	
	
	
	
	
	
}
