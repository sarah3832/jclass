package star;

public class Jastar {

	public static void main(String[] args) {
		// 인터페이스 : 일종의 추상클래스. 추상클래스보다 추상화가 높음.
		// 실제 구현된 것이 전혀없는 기본설계도 (알맹이 없는 껍데기)
		// 구성요소는 추상메서드와 상수만을 멤버로 가질 수 있음.
		// 인스턴스 생성 x, 클래스 작성에 도움을 줄 목적으로 사용.
		// 작성 - class 대신 interface 사용 (외에는 클래스 작성과 동일)
		// 구현 - 클래스를 상속받는 것과 같음.(extends 대신 implements 사용)
		// 상속과 구현 동시에 가능
		// -------------------------------------------------------
		
		
//		Unit u = new Unit();  // abstract 있어서 선언불가
		Unit[] u = new Unit[10];  // 배열선언
		u[0] = new Marine();
		u[1] = new Marine();
		u[2] = new Marine();
		u[3] = new Tank();
		u[4] = new Tank();
		u[5] = new Tank();
		u[6] = new Tank();
		u[7] = new Dropship();
		u[8] = new Dropship();
		u[9] = new Dropship();
		
		for(int i=0;i<u.length;i++) {
			u[i].move(100,100);
		}

	}

}
