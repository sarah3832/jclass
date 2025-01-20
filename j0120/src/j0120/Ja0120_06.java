package j0120;

public class Ja0120_06 {

	public static void main(String[] args) {
		
//		Ja0120_06(){}  // 기본생성자
		
//		int total = 1;
//		for(int i=1;i<=5;i++) {
//			total = total*i;
//		}
//		System.out.println(total);
		
		// 객체선언
//		Ja0120_06 j = new Ja0120_06();
//		System.out.println(j.fac(5));
		System.out.println(fac(5));  // static
		int k = 0;
		double m = 0;
		float n = 0;
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);

		// 생성자 : 인스턴스가 생성될 때마다 호출되는 '인스턴스 초가화 매서드'
		// 생성자의 조건 : 객체이름과 동일, 리턴값 없음(void x)
		// 기본 생성자 : 매개변수가 없는 생성자
//		Card c = new Card();  // 생성자
		
	}
	
	// 재귀호출 : 자기자신을 반복적으로 호출하는 것
	// 오버로딩 : 이름은 같고, 개수나 타입이 달라야함.
	static long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n*fac(n-1);
		}
		return result;
	}
//	// 타입다름
//	static long fac(double n) {
//		
//	}
//	// 개수다름
//	static long fac(int n,int b) {
//		
//	}
	
	
}
