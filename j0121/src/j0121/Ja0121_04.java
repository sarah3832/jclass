package j0121;

import java.util.Scanner;

public class Ja0121_04 {

	public static void main(String[] args) {
		// 상속 : 클래스의 재사용 (extends)
		// 오브젝트 : 모든 클래스의 조상
		// 클래스 != 객체 (전혀다름)
		// 오버라이딩 : 메서드를 재정의 하는것 (상속일때만 가능, 선언부 같아야함)
		
		// 제어자 : 클래스,변수,메서드의 선언부에 사용되어 부가적인 의미를 부여
		// 접근제어자(public,protected,default,private) / 그 외의 제외자로 나뉨
		
		// static 사용될 수 있는 곳 : 멤버변수, 메서드, 초기화 블럭
		// final 사용될 수 있는 곳 : 클래스, 메서드, 멤버변수, 지역변수
		// ---------------------------------------------------------
		
		// 카드게임
		// 카드게임을 실행합니다.
		// 컴퓨터가 랜덤으로 1개를 뽑고
		// my 1-52 카드 중, 내가 1개를 뽑아서
		// 무늬 순 : Spade > Diamond > Heart > Clover
		// 숫자가 높은사람이 승리해서
		// 100만원을 지급하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		Card[] my_card = new Card[1]; 
		while(true) {
			System.out.println("         [ 카드게임 ]");
			System.out.println("----------------------------");
			System.out.println("카드게임을 시작합니다.");
			System.out.println("1. 카드생성");
			System.out.println("2. 카드섞기");
			System.out.println("3. 카드뽑기");
			System.out.println("0. 종료");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("52장의 카드를 생성합니다.");
				break;
				
			case 2:
				System.out.println("카드를 섞습니다.");
				d.shuffle();
				
			case 3:
				System.out.println("카드를 뽑습니다. 승자는?");
				int no = (int)(Math.random()*1); 
//				Card my_pick = d.pick(no);
//				d.print(my_pick);
			} // switch
			

		} // while

		
		
		
		
	} // main

} // class
