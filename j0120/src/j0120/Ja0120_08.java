package j0120;

import java.util.Scanner;

public class Ja0120_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[3];  // 배열선언
		for(int i=0;i<3;i++) {
			System.out.println("학생이름을 입력하세요.");
			String name = scan.next();
			System.out.println("국어점수 입력 >> ");
			int kor = scan.nextInt();
			System.out.println("영어점수 입력 >> ");
			int eng = scan.nextInt();
			System.out.println("수학점수 입력 >> ");
			int math = scan.nextInt();
			s[i] = new Stuscore(name,kor,eng,math);
			s[i].print();		
		}
		
		// 4번째 학생
		Stuscore s1 = new Stuscore();
		System.out.println(s1.count);
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		s1.print();
		
// ------------------------------------------			
		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		c2 = c1;  // 얕은 복사
//		Car c3 = new Car(c1);
		
// ------------------------------------------	
		
		// 1,홍길동,100,100,100 입력해서
		// 1,홍길동,100,100,100,300,100.0 출력
//		Stuscore s = new Stuscore();
//		s.no = 1;
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 100;
//		s.total = s.kor+s.eng+s.math;
//		s.avg = s.total/3.0;
//		s.print();
//
//		Stuscore s2 = new Stuscore(2,"유관순",99,98,97);
//		s2.print();
		
//		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",s.no,s.name,s.kor,s.eng,s.math,s.total,s.avg);
//		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f \n",s2.no,s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
		
// ------------------------------------------		
		
//		Car c = new Car();
//		c.color = "White";
//		c.gearType = "auto";
//		c.door = 4;
//		
//		// red,stick,5
//		Car c2 = new Car("red","sitck",5);
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);

	}

}
