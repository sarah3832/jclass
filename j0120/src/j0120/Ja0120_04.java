package j0120;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0120_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 두수를 Cal3에 보내면 +,-,*의 값을 리턴해서 출력
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;
		System.out.println(Arrays.toString(re));
		c3.op(a, b, re);
		System.out.println(Arrays.toString(re));
		
// ------------------------------------------	
		
		// Cal2 - strPrint() 에서 이름을 입력받아
		// main 메소드에서 str변수로 넘겨받아 출력
//		Cal2 c = new Cal2();
//		String[] input = c.strPrint();
//		for(int i=0;i<input.length;i++) {
//			System.out.println("이름 : "+input[i]);
//		}
		
// ------------------------------------------		
		
		// 입력부분을 class로 분리
		// 객체선언
//		Input i = new Input();
//		// main 메소드에서 배열사용
//		// 5개를 입력받아 출력
//		// 입력
//		int[] input = new int[5];
//		for(int j=0;j<input.length;j++) {
//			input[j] = i.valInput();
//		}
//		// 출력
//		for(int j=0;j<input.length;j++) {
//			System.out.println("입력값 : "+input[j]);
//		}
		
// -------------------------------------------		
		
//		int a = 10;
//		int b = 3;
		
		// 객체선언
//		Cal c = new Cal();
//		int result = c.multi(a, b);
//		System.out.println(result);
//		
//		int result2 = c.add(a, b);
//		System.out.println(result2);
//		
//		int result4 = c.sub(a, b);
//		System.out.println(result4);
//		
//		double result3 = c.div(a, b);
//		System.out.println(result3);
		
		
	}

}
