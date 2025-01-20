package j0120;

public class Stuscore {
	
	// 초기화 블럭
	{
		++count;
		this.no = count;
	}
	
	Stuscore(){} // 1.기본생성자
	
	// 2.매개변수 생성자
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	} 

	// 학생성적
	static int count;  // 클래스변수(공용)
	int no;  // 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void print() {
		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",no,name,kor,eng,math,total,avg);
	}
}
