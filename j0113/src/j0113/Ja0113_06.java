package j0113;

public class Ja0113_06 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = 65;  // A
		System.out.println(ch2);
		
		int ch3 = 65;  // 65
		System.out.println(ch3);
		
		//char ch4 = 'AB';  // 두 문자 불가능
		String ch4 = "AB";  // String : 두 문자 이상 가능
		System.out.println(ch4);
		
		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1);  // 타입 : String
		
		System.out.println(""+7);  // 타입 : String
		System.out.println(""+7+7);  // 문자열로 시작돼서 더하기 x (77)
		System.out.println(7+7+""+7);  // 타입 : String (14+문자열+7 = 147)
		
		//char ch5 = '';  // '' 사이에 없는 것은 에러
		char ch6 = ' ';  // ' ' 빈공백 문자 가능
		
		// 문자열은 "" 안에 없는 것, 빈공백 다 가능
		String s2 = "";
		String s3 = " ";
		
		byte b1 = 127;  // byte : 127까지만 들어갈 수 있음.
		//byte b2 = 128;  // 에러
		
		int n1 = 2147483647;  // int : -2147483648 ~ 2147483647 까지만 들어갈 수 있음.
		//int n2 = 2147483648;  // 에러
		
		int n3 = n1+1;
		System.out.println(n3);  // 정수의 오버플로우 : 최대값에서 +1 하면, 최소값인 -2147483648 나타남.
		
		// *****************************************
		
	}

}
