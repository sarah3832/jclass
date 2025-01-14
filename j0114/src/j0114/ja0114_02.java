package j0114;

import java.util.Scanner;

public class ja0114_02 {

	public static void main(String[] args) {
//		input("데이터를 입력하세요.");  -> 파이썬
		
		// 입력을 받으려면
		// 1. Scanner 선언
		// 정수형 - nextInt, nextLong, nextByte, nextShort (Int,Long 자주사용)
		// 실수형 - nextFloat, nextDouble
		// 문자열 - next, nextLine
		
		// 입력을 위해서 객체선언을 해야 함
		Scanner scan = new Scanner(System.in);
		
		// 문자열
		System.out.println("문자열을 입력하세요.");
		String str1 = scan.next();  // next : 사이띄우기 전 까지만 출력됨.
		System.out.println("문자열1 : "+str1);
		scan.nextLine();  // 엔터키가 넘어가는거 막아줌.
		
		System.out.println("문자열을 입력하세요.");
		String str2 = scan.nextLine();  // nextLine : 엔터키도 포함 출력됨.
		System.out.println("문자열2 : "+str2);
		
		// 정수형
//		System.out.println("정수를 입력하세요.");
//		int num = scan.nextInt();
//		System.out.println("정수 : "+num);
//		
		// 실수형
//		System.out.println("실수를 입력하세요.");
//		double d = scan.nextDouble();  // float, double 둘다가능
//		System.out.println("실수 : "+d);

	}

}
