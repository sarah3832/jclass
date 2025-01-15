package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-100 랜덤숫자를 생성
		// 10번의 도전으로 정답을 맞추면, 종료
		// 랜덤숫자 보다 큰수, 작은수 출력
		// 입력한 숫자를 모두출력
		
		// 랜덤숫자 : 55
		// 입력한 숫자 : 1,2,3,4,55
		// 도전 : 5
		
		int ran = (int)(Math.random()*100)+1;
		int count = 0;
		int[] num = new int[10];
		
		for(int i=0;i<10;i++) {
			count +=1 ;
			System.out.printf("%d번째 도전!숫자를 입력하세요.",count);
			int input = scan.nextInt();
			num[i] = input;			
			if (ran == input) {
				System.out.println("정답!");
				break;
			}else if(ran < input) {
				System.out.println("입력한 숫자가 더 큽니다.");
			}else{
				System.out.println("입력한 숫자가 더 작습니다.");
			}
		}
		System.out.printf("랜덤숫자 정답 : %d \n",ran);
		System.out.printf("도전횟수 : %d \n",count);
		System.out.printf("입력숫자 : ");
		for(int i=0;i<count;i++) {
			if(i==(count-1)) {
				System.out.print(num[i]);			
			}else {
				System.out.print(num[i]+", ");				
			}
		}
	
		
		

	}

}
