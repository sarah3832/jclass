package j0127;

import java.util.Scanner;

public class Ball_deck {
	Scanner scan = new Scanner(System.in);
	
	int[] ball = new int[45];
	int[] lotto = new int[6];
	int[] input = new int[6];
	int[] answer = new int[6];
	int count = 0;
	int temp = 0;
	
	// ball 45개생성
	void ball() {
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
	}
	
	// ball 섞기
	void ball_shake() {
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}
	}
	
	// 6개 로또번호 추출
	void ball_in() {
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
			System.out.println(lotto[i]);
		}
	}
	
	// 6개 숫자입력
	void ball_input() {
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 로또번호를 입력하세요.",i+1);
			input[i] = scan.nextInt();
		}
	}
	
	// 로또번호와 입력번호 비교
	void ball_w() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if( lotto[i] == input[j]) {
					answer[count] = input[j];
					count++;
				}
			}
		}
	}
	
	// 출력
	void ball_final() {
		System.out.println("      [ 로또번호 확인 ]");
		System.out.println("***************************");
		System.out.printf("로또번호 : %d\t%d\t%d\t%d\t%d\t%d\n",lotto[0],lotto[1],lotto[2],lotto[3],lotto[4],lotto[5]);
		System.out.printf("입력번호 : %d\t%d\t%d\t%d\t%d\t%d\n",input[0],input[1],input[2],input[3],input[4],input[5]);
		System.out.printf("맞춘개수 : %d\n",count);
		System.out.print("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.err.print(answer[i]+" ");
		}
		System.out.println();
	} 
	
	
	
	
	
	
	
	
	
	

}
