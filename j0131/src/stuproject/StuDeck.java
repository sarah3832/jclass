package stuproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int choice = 0, rankC = 0;
	
	// 파일 불러오기
	StuDeck() throws Exception{
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}else {
				String[] stuarr = line.split(",");
				int no = Integer.parseInt(stuarr[0]);
				String name = stuarr[1];
				int kor = Integer.parseInt(stuarr[2]);
				int eng = Integer.parseInt(stuarr[3]);
				int math = Integer.parseInt(stuarr[4]);
				int total = Integer.parseInt(stuarr[5]);
				double avg = Double.parseDouble(stuarr[6]);
				int rank = Integer.parseInt(stuarr[7]);
				list.add(new Stu(no, name, kor, eng, math, total, avg, rank));
			}
		}
		br.close();
		fr.close();
	}
	
	
	// 학생성적 입력 
	void sInput() {
		System.out.println("[ 학생성적 입력 ]");
		while(true) {
			System.out.printf("%d번째 학생이름을 입력하세요.(0.이전페이지) >> ",list.size()+1);
			String name = scan.next();
			if(name.equals("0")) {
				break;
			}
			System.out.println("국어점수를 입력하세요. >> ");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요. >> ");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요. >> ");
			int math = scan.nextInt();
			
			list.add(new Stu(name, kor, eng, math));
			System.out.printf("%s학생 성적이 저장 되었습니다! \n",name);
		} // while
	}
	
	
	// 학생성적 출력 
	void sPrint() {
		System.out.println("                       [ 학생성적 출력 ]");
		System.out.println("-------------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",list.get(i).getNo(),list.get(i).getName(),
					list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),
					list.get(i).getAvg(),list.get(i).getRank());
		}
	}
	
	
	// 학생성적 수정 
	void sResave() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("성적을 수정하고자 하는 학생을 입력하세요. >> ");
		String name = scan.next();
		int searchNo = 0;
		int temp = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(name.equals(s.getName())) {
				searchNo = i;
				temp = 1;
			}
		}
		Stu s = (Stu)list.get(searchNo);
		if(temp == 1) {
			System.out.printf("[ %s학생 성적수정 ] \n",name);
			System.out.println("1. 국어점수");
			System.out.println("2. 영어점수");
			System.out.println("3. 수학점수");
			System.out.println("수정하고자 하는 과목을 선택하세요. >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.printf("현재 국어점수 : %d \n",s.getKor());
				System.out.print("수정 국어점수 >> ");
				int kor = scan.nextInt();
				s.setKor(kor);
				break;
			case 2:
				System.out.printf("현재 영어점수 : %d \n",s.getEng());
				System.out.print("수정 영어점수 >> ");
				int eng = scan.nextInt();
				s.setKor(eng);
				break;
			case 3:
				System.out.printf("현재 수학점수 : %d \n",s.getMath());
				System.out.print("수정 수학점수 >> ");
				int math = scan.nextInt();
				s.setKor(math);
				break;
			}
		}else {
			System.out.printf("%s학생을 찾을 수 없습니다.",name);
		}
	}
	
	
	// 학생성적 삭제
	void sDelete() {
		System.out.println("[ 학생성적 삭제 ]");
		System.out.println("삭제하고자 하는 학생을 입력하세요. >> ");
		String name = scan.next();
		int temp = 0;
		int searchNo = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(name.equals(s.getName())) {
				temp = 1;
				searchNo = i;
			}
		}
		Stu s = (Stu)list.get(searchNo);
		if(temp == 0) {
			System.out.printf("%s학생을 찾을 수 없습니다.",name);
		}else {
			System.out.printf("%s학생을 정말로 삭제 하시겠습니까? (1.예 2.아니오)",name);
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				list.remove(searchNo);
				System.out.printf("%s학생이 삭제 되었습니다.",s.getName());
				break;
			case 2:
				System.out.printf("%s학생 삭제를 취소합니다.",s.getName());
				break;
			}
		}
	}
	
	
	// 학생성적 검색
	void sSearch() {
		System.out.println("[ 학생성적 검색 ]");
		System.out.println("찾고자하는 학생을 입력하세요. >> ");
		String name = scan.next();
		int temp = 0;
		int searchNo = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(name.equals(s.getName())) {
				temp = 1;
				searchNo = i;
			}
		}
		Stu s = (Stu)list.get(searchNo);
		if(temp == 0) {
			System.out.printf("%s학생을 찾을 수 없습니다.",name);
		}else {
			System.out.printf("검색하신 %s학생을 찾았습니다! \n",s.getName());
			System.out.printf("                       [ %s학생 성적표 ] \n",s.getName());
			System.out.println("--------------------------------------------------------------");
			for(int j=0;j<title.length;j++) {
				System.out.printf("%s\t",title[j]);
			}
			System.out.println();
			System.out.println("--------------------------------------------------------------");
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),s.getKor(),
					s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
	}
	// 학생등수 정렬
	void sSort() {
		System.out.println("[ 학생등수 정렬 ]");
		System.out.println("1. 등수 순차정렬");
		System.out.println("2. 등수 역순정렬");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s1.getRank() - s2.getRank();
				}
			});
			System.out.println("등수 순차정렬이 완료되었습니다.");
			break;
		case 2:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s2.getRank() - s1.getRank();
				}
			});
			System.out.println("등수 역순정렬이 완료되었습니다.");
		}
	}
	
	
	// 학생이름 정렬
	void sNsort() {
		System.out.println("[ 학생이름 정렬 ]");
		System.out.println("1. 이름 순차정렬");
		System.out.println("2. 이름 역순정렬");
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s1.getName().compareTo(s2.getName());
				}
			});
			System.out.println("이름 순차정렬이 완료 되었습니다.");
			break;
		case 2:
			list.sort(new Comparator<Stu>() {
				@Override
				public int compare(Stu s1, Stu s2) {
					return s2.getName().compareTo(s1.getName());
				}
			});
			System.out.println("이름 역순정렬이 완료 되었습니다.");
			break;
		}
	}
	
	
	// 등수처리
	void sRank() {
		System.out.println("[ 등수 처리 ]");
		for(int i=0;i<list.size();i++) {
			rankC = 1;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).getTotal() > list.get(j).getTotal()) {
					rankC++;
				}
				list.get(i).setRank(rankC);
			}
		}
		System.out.println("등수처리가 완료되었습니다.");
	}
	
	
	// 파일저장
	void sSave() throws Exception {
		System.out.println("[ 학생성적 파일 저장 ]");
		FileWriter fw = new FileWriter("c:/save4/stu.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<list.size();i++) {
			String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",list.get(i).getNo(),
					list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
					list.get(i).getTotal(),list.get(i).getAvg(),list.get(i).getRank());
			bw.write(str);
		}
		bw.close();
		fw.close();
		System.out.println("학생성적 파일이 저장되었습니다!");
	}
	
	
	
	
	

}
