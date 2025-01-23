package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add("abc");  // 순서X, 중복X
		set.add("aaa");
		set.add("ccc");
		set.add("aaa");  // 중복 불가능
		set.add("ggg");
		
		System.out.println("개수 : "+set.size());
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------------");
		Iterator i2 = set.iterator();
		while(i.hasNext()) {
			System.out.println(i2.next());
		}
		
		// 이 방식은 안됨
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));  // 값 출력
//		}
		
		
// ----------------------------------------		
		
//		ArrayList list = new ArrayList();
//				
//		for(int i=0;i<10;i++) {
//			list.add(i+1);
//		}
//		// 기본형태
//		Iterator i1 = list.iterator();
//		while(il.hasNext()) {
//			System.out.println(i1.next());
//		}
//		// 편하게 사용하는 형태
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));  // 값 출력
//		}
				

		
		
		
		
		
	}

}
