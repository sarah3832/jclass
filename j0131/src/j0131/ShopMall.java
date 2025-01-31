package j0131;

import java.util.Scanner;

public class ShopMall {

	public static void main(String[] args) {
		
		// 상품관리 - Product -> TV, Computer, Refrigerator(120만원,12포인트), Washing(90만원,9포인트)
		// 유저관리 - Buyer
		// 메서드관리 - Shop_Deck
		// 메인 - ShopMall
		
		Scanner scan = new Scanner(System.in);
		Shop_Deck sd = new Shop_Deck();
		int choice = 0;
		
		// 로그인
		sd.login();
		
		// 화면출력
		loop:while(true) {
			choice = sd.mainPrint();
			switch(choice) {
			case 1:
				sd.buy(new Tv());  // "LGTV",1000000,100000,50,"LED","BLACK"
				break;
				
			case 2:
				sd.buy(new Tv("LG75TV",1500000,150000,75,"LED","BLACK"));
				break;
				
			case 3:
				sd.buy(new Computer());
				break;
				
			case 4:
				sd.buy(new Refrigerator());
				break;
				
			case 5:
				sd.buy(new Washing());
				break;
				
			case 7:
				sd.Plist();
				break;
				
			case 8:
				sd.plusCash();
				break;
				
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
				
			} // switch
		} // while
		
		
		
	} // main

} // class
