package jcard;

public class Ja01 {

	public static void main(String[] args) {
		// 52장 카드생성 -> 카드를 순차적으로 출력
		// 랜덤으로 섞기 -> 52장 출력
		// 0-51 숫자를 입력받아, 해당되는 카드 출력
		
		// 객체생성
		Deck d = new Deck();
		
		// 전체출력
		d.printAll(52);
		
		// 랜덤섞기
		d.shuffle();
		
		// 랜덤출력
		d.printAll(52);
		
		
		
		
		
		
		
	}

}
