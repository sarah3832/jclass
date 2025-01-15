package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-5까지의 랜덤숫자를 생성해서
		// 5번 입력받아 랜덤숫자를 몇번 맞췄는지 개수를 출력.
		// 입력했던 숫자도 모두 출력.
		
		// 정답횟수 : 1번
		// 입력숫자 : 1,2,3,4,5
		
		int[] num = new int[5];  // 입력한 숫자배열
		int ran = (int)(Math.random()*5)+1;  // 랜덤숫자
		int count = 0;  // 정답횟수 변수
		
		for (int i=0;i<5;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.",i+1);
			int input = scan.nextInt();
			num[i] = input;  // 입력한 숫자를 배열에 저장
			// 비교
			if (ran == input) {
				count +=1 ;
				System.out.println("정답!");
			}else {
				System.out.println("오답!");
			}
			
			System.out.printf("랜덤숫자 : %d \n",ran);
			System.out.printf("정답횟수 : %d \n",count);
			System.out.printf("입력숫자 : %d, %d, %d, %d, %d \n",num[0],num[1],num[2],num[3],num[4]);		
			System.out.printf("입력숫자 : %s \n",Arrays.toString(num));
		}

		
		
		
	}

}
