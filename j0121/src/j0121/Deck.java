package j0121;

import jjcard.Card;

public class Deck {
	// 카드에 사용되는 메서드
	
	// 생성자
	Deck(){
		// 입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	Card[] c = new Card[52];  // Card 배열
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] s = {"Spade","Diamond","Heart","Clover"};

	// 카드전체 출력 메서드
	void print_all(int no) {
		System.out.printf("            [ %d개 출력 ]\n",no);
		System.out.println("---------------------------------");
		for(int i=0;i<no;i++) {
			System.out.printf("[%s,%s]\n",c[i].shape,n[c[i].number]);
		}
	} // print_all
	
	
	// 해당번호 출력 
		void print(Card c) {
			System.out.println(c);
		}
		
	
	// 오버로딩 : 같은 이름이지만, 다른 메서드
	void print_all(Card c) {
		System.out.printf("            [ 카드확인 ]\n");
		System.out.println("---------------------------------");
		System.out.printf("[%s,%s]\n",c.shape,n[c.number]);
	} // print_all
	
	
	// 섞기 메서드
	void shuffle() {
		Card temp = null;
		int ran = 0;
		for(int i=0;i<300;i++) {
			ran = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ran];
			c[ran] = temp;
		}
	} // shuffle
	
	
	Card pick(int no) {
		if(no>=0 && no<=51) {
			return c[no];
		}else {
			System.out.println("[경고] 번호확인을 하셔야 합니다.");
			return c[0];
		}
	}

	
}
