package jjbuy;

import java.util.Scanner;

public class JJMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer();
		
		loop:while(true) {
		System.out.println("*** 전자제품 쇼핑물 ***");
		System.out.println("1. TV");
		System.out.println("2. 컴퓨터");
		System.out.println("3. 오디오");
		System.out.println("9. 구매내역");
		System.out.println("0. 종료");
		System.out.println("구매를 원하시는 제품을 선택 >> ");
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
