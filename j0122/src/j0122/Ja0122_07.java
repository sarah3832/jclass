package j0122;

import java.util.ArrayList;

public class Ja0122_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		// 20개를 생성해서 20개를 출력하시오.
		for(int i=0;i<20;i++) {
//			int ran1 = (int)(Math.random()*24);
//			int ran2 = (int)(Math.random()*60);
//			int ran3 = (int)(Math.random()*60);
//			list.add(new Time(ran1,ran2,ran3));
			list.add(new Time(i+1,i+1,i+1));
		}
		
		// 삭제
		list.remove(1);
		list.remove(7);
		list.remove(10);
		
		for(int i=0;i<list.size();i++) {
			Time t = (Time) list.get(i);
			System.out.printf("%d. %02d:%02d:%02d\n",i+1,t.getHour(),t.getMinute(),t.getSecond());
		}
		
		
		
		
		
	}

}
