package j0115;

public class Ja0115_01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것 (많은 양의 값을 다룰때 유용)
		
		// score 배열 100개를 만들어서, 1-100까지 숫자를 입려해서 출력.
		// 배열에 들어가있는 숫자 합계를 출력.
		int[] score = new int[10];
		int sum = 0;
		// 1-10까지 랜덤숫자 입력해서 합계를 출력.
		for(int i=0;i<10;i++) {
			score[i] = (int)(Math.random()*10)+1;
			System.out.println("랜덤숫자 : "+score[i]);
			sum += score[i];
		} 
		System.out.printf("합계 : "+sum);
		
		
//---------------------------------------------		 
		// 배열에 데이터 넣는법
		// 방법 1.
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
//		
//		// 방법 2.
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		
//		// 방법 3.
//		int[] score3 = new int[10];
//		for(int i=0;i<10;i++) {
//			score3[i] = i+1;
//		}
		
		
//		int[] num = new int[10];
//		for(int i=0;i<10;i++) {
//			num[i] = i;
//		}
//		
//		for(int i=0;i<10;i++) {
//			System.out.println(num[i]);
//		}
//		
//		int[] score;
		
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		System.out.println(score[0]);
		
		// 주소값 출력
		//System.out.println(score);
				
//---------------------------------------------
		
//		String str = new String("abc");
//		String str2 = "abc";
//		System.out.println(str);
//		
//		// 비교방법
//		if(str.equals(str2)) {
//			
//		}

	}

}
