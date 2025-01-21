package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		
		// Card 52장을 생성한 후, 1-13와 spade,diamond,heart,clover 넣어서 출력
		Deck d = new Deck();
		
		// 전체출력
		d.print_all(52);
		
		// 섞기실행
		d.shuffle();
		
		// 10번째 카드를 선택
	    Card c = d.pick(10);
	    d.print_all(c);
		
		// 전체출력
		d.print_all(5);
		d.print_all(1);
		
// -------------------------------------------------		
		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				c[i*13+j] = new Card(s[i],j+1);
//			}
//		}
//		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				System.out.printf("[ %s,%s ]\n",c[i*13+j].shape,n[c[i*13+j].number]);
//			}
//		}
//		
//		// 카드를 섞어서 0-4번까지 5장을 출력.
//		Card temp = null;
//		int ran = 0;
//		for(int i=0;i<300;i++) {
//			ran = (int)(Math.random()*52);
//			temp = c[0];
//			c[0] = c[ran];
//			c[ran] = temp;
//		}
//		System.out.println("---------------------------");
//		System.out.println("[ 랜덤섞기 후 ]");
//		for(int i=0;i<5;i++) {
//			System.out.printf("[ %s,%s ]\n",c[i].shape,n[c[i].number]);
//		}
		
		
		
		
		

	}

}
