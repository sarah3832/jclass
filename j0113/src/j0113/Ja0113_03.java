package j0113;

public class Ja0113_03 {

	public static void main(String[] args) {
		int score;
		score = 10;
		System.out.println(score);
		
		// 요약해서 사용
		int s = 100;
		System.out.println(s);
		
		// **********************
		char ch = 'a';
		System.out.println(ch);

		// 한 문자만 가능 (두 문자 이상 x)
		char ch2 = 'ㄱ';  // char 타입은 무조건 ''
		System.out.println(ch2);
		
		// **********************
		String str = new String("abc");  // 무조건 ""
		System.out.println(str);
		
		String str2 = "가나다";
		System.out.println(str2);
		
		// null 값 사용 가능
		String str3 = null;
		System.out.println(str3);
	}

}
