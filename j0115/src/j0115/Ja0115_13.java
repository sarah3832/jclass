package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또맞추기
		
		// 1-45까지 로또번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		//1. 변수선언
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		int count = 0;
		
		//2. 1-45 번호저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1; 
		}	
		
		//3. 배열섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}
		
		//4. 6개 로또번호
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
			System.out.println("로또번호 : "+Arrays.toString(lotto));
		}
		
		//5. 입력창만들기
		String[] balls = new String[45];
//		for(int i=0;i<balls.length;i++) {
//			balls[i] = i+1+"";
//		}
		
		// 6. 맞춘번호 확인 - input,lotto
		for(i=0;i<lotto.length;i++) {
			for(j=0;j<lotto.length;j++) {
				if(input[i] == lotto[j]) {
					answer[count] = lotto[j];
					count++;
					break;
				}
			}
		}
		// 7. 출력
		System.out.println("[로또번호확인]");
		System.out.print("로또번호 : ");
		System.out.println(Arrays.toString(lotto));








	}

}
