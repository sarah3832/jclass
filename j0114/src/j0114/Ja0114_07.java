package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// for : 반복횟수가 있는 경우
		// while : 조건식이 있을 경우
		
		
		// while문 구구단 출력
		int i = 2;
		while(i<=9) {
			System.out.printf("[ %d 단 ]\n",i);
			int j = 1;
			while(j<=9) {
				System.out.printf("%d x %d = %d \t",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		// for문 구구단
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d = %d \n",i,j,i*j);
//			}
//		}
		
		
		
		// while문
//		int i = 1;  // 초기값
//		while(i<=5) {  // 조건식
//			System.out.println("안녕"+i);
//			i++;  // 증감식
//		}
//		
//		for(int j=1;j<=5;j++) {
//			System.out.println("굿걸"+j);
//		}
		
// --------------------------------------------------	
		
		// 입력받은 숫자부터 9단까지 구구단이 시작되도록 프로그램 구현
//		System.out.println("첫번째 숫자를 입력하세요.");
//		int input1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		int input2 = scan.nextInt();
//		
//		int max,min;
//		if (input1>input2) {
//			max = input1;
//			min = input2;
//		}else {
//			max = input2;
//			min = input1;
//		}
//		
//		// 위에 비교문 이런식으로 표현가능
//		max = Math.max(input1, input2);		
//		min = Math.min(input1, input2);
//		
//		for(int i=min;i<=max;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		// 구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		
		// for
//		for(int i=0;i<=10;i++) {  // 무한반복
//			System.out.println("안녕"+i);
//			
//		}
// -----------------------------------
		// 입력받은 글자를 1개씩 출력하는 프로그램 구현
//		System.out.println("영문자를 입력하세요.");
//		String input = scan.next();
//		
//		// 영문자 일때만 1개씩 출력
//		// 1. 영문자인지 확인
//		int temp = 0;
//		for(int i=0;i<input.length();i++) {
//			if(!(input.charAt(i)>='a' && input.charAt(i)<='z' || input.charAt(i)>='A' && input.charAt(i)<='Z')) {	
//				temp = 1;
//				break;
//			}		
//		}
//		// 2. 영문자이면 출력, 그렇지 않으면 다시입력 출력
//		if(temp == 0) {
//			for(int i=0;i<input.length();i++) {
//				System.out.println(input.charAt(i));
//			}
//		}else {
//			System.out.println("입력한 글자중에 영문자가 아닌것이 있습니다. 다시 입력하세요.");
//		}
		
		
		// 단어를 1개씩 출력
//		String input = "abcdefghijk";
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
		
//		System.out.println(input.length());
//		System.out.println(input.charAt(input.length()-1));
		
		
		
//		System.out.println("글자를 입력하세요.(영문자만 입력가능) : ");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력 : "+ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요!");
//		}
// -----------------------------------
			
		// 반복문 - 한줄일때는 중괄호 생략가능
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			System.out.println("안녕하세요.");
////			sum = sum + i;
//			sum += i;
//		}
//		System.out.println(sum);

	}

}
