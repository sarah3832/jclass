package jjcard;

import java.util.*;
//import java.util.Scanner;
//import java.util.Arrays;

public class JaMain extends Object{
	public JaMain(){}

	public static void main(String[] args) {
		// 오브젝트 클래스 : 모든 클래스의 최고조상
		// 조상이 없는 클래스는 자동적으로 object 클래스를 상속받게 됨.
		// 상속계층도의 최상위에는 object클래스가 위치함.
		// 모든 클래스는 object 클래스에 정의된 11개의 메서드를 상속받음
		
		// 오버라이딩 : 조상클래스로부터 상속받은 메서드내용을 상속받는 클래스에 맞게 뱐걍하는 것.
		// 조건 : 선언부가 같아야함.(이름,매개변수,리턴타입)
		
		// this : 인스턴스 자신을 가리키는 참조변수(모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재)
		// super : this와 같음. 조상의 멤버와 자신의 멤버를 구별하는데 사용
		
		// 패키지 : 서로 관련된 클래스와 인터페이스의 묶음(.으로 구분)
		// 조건 : 젤 상단에 적어햐함.
		// 패키지의 선언 : 단 한번만 할 수 있음. 
		// -------------------------------------------------
		
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();  // 52장 카드생성
		Card[] my_card = new Card[5];
		int choice = 0;
		while(true) {
			System.out.println("         [ 카드 게임 ]");
			System.out.println("----------------------------");
			System.out.println("1. 카드생성 (번호부여)");
			System.out.println("2. 카드 전체출력");
			System.out.println("3. 카드섞기");
			System.out.println("4. 카드 5장 받기");
			System.out.println("5. 내 카드 보기");
			System.out.println("6. 특정위치 카드출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("        [ 카드 생성 ]");
				System.out.println("--------------------------");
				d.input();  // 번호부여
				break;
				
			case 2:
				System.out.println("      [ 52장 카드출력 ]");
				System.out.println("--------------------------");
				d.print(52);
				break;

			case 3:
				d.shuffle();
				System.out.println("카드섞기 완료!");
				break;
				
				
			case 4:
				for(int i=0;i<5;i++) {
					my_card[i] = d.pick(i);
				}
				System.out.println("카드 5개 받기완료!");
				break;
				
			case 5:
				System.out.println("      [ 내 카드 출력 ]");
				System.out.println("--------------------------");
				for(int i=0;i<5;i++) {
					System.out.println(my_card[i]);
				}
				break;
				
			case 6:
				System.out.println("몇번째 카드를 가져오시겠습니까?");
				int no = scan.nextInt();
				Card c_pick = d.pick(no);
				d.print(c_pick);
				
				
			} // switch
			
			
		} // while
		
		
		
	} // main

} // class
