package jbuy;

import java.util.Scanner;

public class JaMain {

	public static void main(String[] args) {
		// 추상클래스 : 클래스가 설계도라면 추상클래스는 '미완성 설계도'
		// 추상메서드(미완성메서드)를 포함하고 있는 클래스
		// void aaa();  <- 미완성 메서드
		// void bbb(){};  <- 완성 메서드(중괄호 있으면)
		
		Scanner	scan = new Scanner(System.in);
		Buyer b = new Buyer(); 
				
		loop:while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ]");
			System.out.println("1. TV ");
			System.out.println("2. COMPUTER ");
			System.out.println("3. AUDIO ");
			System.out.println("9. 구매(cart) 정보");
			System.out.println("0. 쇼핑몰 종료");
			System.out.println("구매를 원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				b.buy(new Tv());
				b.myInfo();
				break;
				
			case 2:
				b.buy(new Computer());
				b.myInfo();
				break;
				
			case 3:
				b.buy(new Audio());
				b.myInfo();
				break;
				
			case 9:
				b.cartInfo();
				break;
				
			case 0:
				break loop;
				
			} // switch
			
		} // while
		
		
		
		

	} // main

} // class
