package j0131;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop_Deck {
	Scanner scan = new Scanner(System.in);
	Buyer user1;  // user 아이디
	ArrayList<Product> list = new ArrayList<Product>();  // 상품구매 리스트
	
	// 구매 메서드
	void buy(Product p) {
		p.getPrice();  // 제품 금액
		p.getPoint();  // 제품 포인트
		user1.setMoney(user1.getMoney()-p.getPrice());  // user 금액 - 제품금액 = 현재 user 금액 저장
		user1.setMyPoint(user1.getMyPoint()+p.getPoint());  // 포인트는 +
		list.add(p);  // 리스트에 추가
		System.out.println("       [ 구매 상품 ]");
		System.out.println("--------------------------");
		System.out.println("상품 : "+p.getName());
		System.out.printf("상품 금액 : %,d 원 \n",p.getPrice());
		System.out.printf("현재 잔액 : %,d 원 \n",user1.getMoney());
		System.out.println("--------------------------");
		System.out.println("상품을 구매하였습니다!");
	}
	
	
	// 로그인 메서드
	void login() {
		while(true) {
			System.out.println("     [ 쇼핑몰 프로그램 ]");
			System.out.println("**************************");
			System.out.println("로그인을 하셔야 쇼핑몰 프로그램에 들어갈 수 있습니다.");
			System.out.println("< 로그인 >");
			System.out.println("아이디 : ");
			String id = scan.next();
			System.out.println("패스워드 : ");
			String pw = scan.next();
			if(id.equals("admin") && pw.equals("1111")) {
				// db 접근
				user1 = new Buyer("admin","1111","관리자","서울",100000000,10000000);
				System.out.printf("     [ %s 회원정보 ] \n",user1.getUserName());
				System.out.println("-------------------------");
				System.out.println(id+"님이 로그인 되었습니다!");
				System.out.printf("현재 충전금액 : %,d원 \n",user1.getMoney());
				break;
			}else {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			}
		} // while
	} // login
	
	
	// 화면출력 메서드
	int mainPrint() {
		loop:while(true) {
			System.out.println();
			System.out.println("     [ 쇼핑몰 프로그램 ]");
			System.out.println("**************************");
			System.out.println("1. 50인치 LED TV");
			System.out.println("2. 75인치 LED TV");
			System.out.println("3. 노트북");
			System.out.println("4. 냉장고");
			System.out.println("5. 세탁기");
			System.out.println("6. 배송지 및 상품색상");
			System.out.println("7. 구매 리스트");
			System.out.println("8. 현금 충전");
			System.out.println("9. 상품등록(관리자)");
			System.out.println("0. 프로그램 종료");
			System.out.println("**************************");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			return choice;
		} // while
	}
	
	
	// 구매 리스트 메서드
	void Plist() {
		int sum = 0;
		System.out.println("     [ 상품구매 리스트 ]");
		System.out.println("-------------------------");
		if(list.isEmpty()) {
			System.out.println("구매한 상품이 없습니다.");
		}else {
			System.out.printf("** 상품구매 리스트 개수 : %d **\n",list.size());
			for(int i=0;i<list.size();i++) {
				System.out.printf("%d. %s\n",i+1,list.get(i).getName());
				sum += list.get(i).getPrice();
			}
			System.out.printf("** 구매 총 금액 : %,d원 **\n",sum);
		}
		System.out.println("-------------------------");
	}
	
	
	
	// 현금충전 메서드
	void plusCash() {
		System.out.println("        [ 현금 충전 ]");
		System.out.println("----------------------------");
		System.out.printf("현재 잔액 : %,d원 \n",user1.getMoney());
		System.out.print("충전 할 금액을 입력하세요 >> ");
		int price = scan.nextInt();
		System.out.printf("충전 금액 : %,d원 \n",price);
		user1.setMoney(user1.getMoney()+price);
		System.out.printf("** 현재 잔액 : %,d원 **\n",user1.getMoney());
		System.out.println("----------------------------");
	}
	
	
	
	
	
	
}

