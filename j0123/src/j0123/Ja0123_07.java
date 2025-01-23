package j0123;

import java.util.ArrayList;

public class Ja0123_07 {

	public static void main(String[] args) {
		// ArrayList 장점 : 읽기가 편함
		
		ArrayList list = new ArrayList();
		
		for(int i=0;i<10;i++) {
			list.add(i+1);
		}
		
		list.add(4,100);  // 위치에 값 입력 (4번째 자리에 100)
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));  // 값 출력
		}
		
		list.remove(2);
		System.out.println("--------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));  // 값 출력
		}
		for(int i=0;i<list.size()-1;i--) {  // 삭제는 반대로 (i<list.size()-1;i--)
			list.remove(i); 
		}
		// list.clear() : 전체삭제
		System.out.println("-----------전체삭제 후 출력---------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));  // 값 출력
		}
		
		
		
		
		
		
		
		
		
//		List list2 = new ArrayList();
		
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		Integer i3 = new Integer(3);
//		Integer i4 = new Integer(4);
//		list.add(i1);  // 1 -> 기본타입, list -> 객체타입
//		list.add(i2);  // 1 -> 기본타입, list -> 객체타입
//		list.add(i3);  // 1 -> 기본타입, list -> 객체타입
//		list.add(i4);  // 1 -> 기본타입, list -> 객체타입

//		list.add(1);  // 순서O, 중복O
//		list.add(2);  // 값 입력
//		list.add(3);
//		list.add(3);
//		list.add(4);
//		for(int i=0;i<list.size();i++) {  // 크기
//			System.out.println(list.get(i));  // 해당번호 출력
//		}
//		System.out.println("--------------");
//		list.remove(3);  // index번호 삭제
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println("--------------");
//		list.clear();  // 전체삭제
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		if(list.isEmpty()) {  // 값이 있는지 확인
//			System.out.println("파일이 없습니다.");
//		}
		
		
		
		

	}

}
