package jcard;

class Deck {
	
	Deck(){
		// 생성
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(shape[i],j+1);
			}
		}
	}
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] shape = {"Spade","Diamond","Heart","Clover"};
	
	
	void printAll(int no) {
		// 출력
		System.out.println("              [ 출력 ]");
		System.out.println("-----------------------------------");
		for(int i=0;i<no;i++) {
			System.out.printf("[ %s,%s ]\n",c[i].shape,n[c[i].number]);
		}
	} // printAll
	
	
	
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


	
	
	
}
