package j0122;

public class Ja0122_03 {

	public static void main(String[] args) {
		// 참조변수의 형변환
		// 자손타입 -> 조상타입 (Up-casting) : 형변환 생략가능
		// 조상타입 -> 자손타입 (Down-casting) : 형변환 생략불가능
		// ---------------------------------------------
		
		
		// CaptionTv - text, caption()
		CaptionTv c = new CaptionTv();
		// Tv - power, channel, power(), channelUp(), channelDown()
		c.text = "[뮤직비디오] 로제-APT";
		System.out.println("자막 : "+c.text);
		c.caption();
		
		Tv t2 = new Tv();
//		t2.text = "자막기능이 없음."
		Tv t = new CaptionTv();
		CaptionTv c3;
		c3 = (CaptionTv)t;
		c3.text = "aaa";
		t = c3;  // 생략가능 (자손타입 -> 조상타입)
		System.out.println(c3.text);
		
		// 에러
//		c3 = (CaptionTv)t2;
//		c3.text = "bbb";
		
//		t.text = "";  // 에러
//		CaptionTv c2 = new Tv();  // 자손의 참조변수 = 부모객체 안됨
		
		
		
		
		

	}

}
