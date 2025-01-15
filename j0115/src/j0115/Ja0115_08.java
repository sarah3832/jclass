package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10까지 랜덤숫자를 입력받아, 동일한 번호가 없게 저장하시오.
		
//		int[] num = new int[10];
//		int i = 0;
//		
//		loop:while(i<10) {
//			int ran = (int)(Math.random()*10)+1;
//			for(int j=0;j<10;j++) {
//				if (num[j] == ran){
//					System.out.println("중복 숫자 : "+ran);
//					continue loop;
//				}
//					
//			}
//			num[i] = ran;
//			i++;		
//		}
//		System.out.printf("번호 저장 : ");
//		for(int j=0;j<num.length;j++) {
//			System.out.print(num[j]+" ");
//		}
//		System.out.println();
		
		
		// 배열을 랜덤섞기 출력하는 방법
		int[] num = new int[10];
		
//		for(i=0;i<num.length;i++) {
//			num[i] = i+1;
//		}
		
		// 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*10);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
			
		}
		
		System.out.print("랜덤입력숫자 : ");
		for(int j=0;j<10;j++) {
			System.out.println(num[j]+" ");
		}
		System.out.println();

		
		
		
		
		
		
	}

}
