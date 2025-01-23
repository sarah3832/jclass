package j0123;

import java.util.Scanner;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Object 클래스의 메서드 : 모든 클래스의 최고조상, 11개의 메서드
		// clone() : 객체 자신을 복제해서 새로운 객체를 생성하는 메서드, 인스턴스변수의 값만 복제함.
		// 'Cloneable 인터페이스' 해야함
		
		// 컬렉션 : 여러 객체(데이터)를 모아놓은 것을 의미
		// 컬렉션 프레임웍의 핵심 인퍼페이스 : List, Set, Map
		// List - 순서가 있는 데이터의 집합. 데이터의 중복을 허용. (ArrayList, LinkedList..)
		// Set - 순서를 유지하지 않는 데이터의 집합. 데이터의 중복허용 x (HashSet, TreeSet..)
		// Map - 키와 값의 쌍으로 이루어진 데이터의 집합. 순서유지 x, 키는 중복허용 x, 값 중복허용 o
		// (HashMap, TreeMap..)
		
		
		
		Scanner scan = new Scanner(System.in);
		//-----------------------------------------------------------------

		String a = new String("a");
		StringBuffer str = new StringBuffer("aaa");
		System.out.println(a+1);  // a1,a2,a3  
		System.out.println(str.append(2).append("aaa"));  // append로 계속 추가해야함.
		
//		String a = "a";
//		for(int i=0;i<10;i++) {
//			a += i;
//		}
		
// ----------------------------------------------		
		
		// indexOf
//		String str = "bbaaccAABBCCaaddeeffAAaa";
//		int count = 0;
//		for(int i=0;i<str.length();i++) {
//			if(str.indexOf("aa",i) == -1 ) {  // aa가 없을때
//				break;
//			}else {  // aa가 있을때
//			count++;
//			i = str.indexOf("aa",i);
//			System.out.println("aa 존재위치 : "+i);
//			}
//		}
//		System.out.println("aa가 존재하는 개수 : "+count);
		
// ----------------------------------------------		
		
		// valueOf
//		int a = 10;
//		double b = 3.14;
//		// double -> string
//		String a1 = String.valueOf(a);  
//		String a2 = String.valueOf(b);  
//		String a3 = ""+a;
//		String a4 = ""+b;
//		
//		// string -> double
//		String str1 = "3.14";
//		double a5 = Double.parseDouble(str1);
//
//		// string -> int
//		String str2 = "100";
//		int a6 = Integer.parseInt(str2);
		
// ----------------------------------------------
		
//		String[] arr = {"홍길동임","유관순입니다","이순신이다","강감찬일까요?","김구에요","홍길순","홍길자임다"};
//		// 첫글자, 마지막글자 빼고 모두 출력하시오
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].substring(1,arr[i].length()-1));
//		}
		
		// substring : 시작 위치값 설정
//		String str = "1조1234567";
//		System.out.println(str.substring(0,2));  // 1조
//		System.out.println(str.substring(2));   // 1234567
//		System.out.println(str.substring(2,6));  // 1234
		
// ----------------------------------------------
		
		// length() : 문자의 길이
//		String str = "안녕하세요. 방가방가. 홍길동입니다.";
//		// 10자 이상이면 글자를 다시 입력하세요.
//		System.out.println(str.length());
//		while(true) {
//			System.out.println("10자 이내로 글자를 입력하세요. >> ");
//			String input = scan.next();
//			if(input.length() < 10) {
//				System.out.println("입력한 글자 : "+input);
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else {
//				System.out.println("10글자 이상입니다. 다시 입력하세요.");
//			}
//		}
		
		
		// replace 빈공백 제거 (가운데 공백제거 가능)
//		String str = "           하       이    입니   다";
//		System.out.println(str.replace(" ",""));

		
		// replace : 문자를 다른문자로 대체
//		String str = "안녕하세요. 홍길동입니다. 성은 홍입니다.";
//		String input = "김";
//		str.replace("홍","김");
//		System.out.println(str.replace("홍","김"));  // 원본은 변경되지 않음
//		System.out.println(str);

		
		// trim : 빈공백 제거 (가운데 공백은 제거 x)
//		String str = "           하       이    입니   다";
//		System.out.println(str);
//		System.out.println(str.trim());

		
		// indexOf : 존재하는 위치값을 알려줌 (없다면 -1)
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "김";
//		System.out.println("있는 위치 : "+str.indexOf(input));
//		int no = str.indexOf(input);
		
// ----------------------------------------------	
		
		// contains : 문자열이 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		
//		if(input.contains(input)) {
//			System.out.println("홍이라는 글자가 있습니다.");
//		}else{
//			System.out.println("홍이라는 글자가 없습니다.");
//		}
//		
//		// arr 배열에서 '홍'이있는 이름을 출력
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].contains(input)) {
//				System.out.println("홍이 있는 사람 : "+arr[i]);
//			}
//		}
		
// ----------------------------------------------	
		
//		String str = "1,홍길동,100,100,100,0,0,0,0";
//		// 학번 : 1
//		// 이름 : 홍길동
//		// 국어 : 100
//		// 영어 : 100
//		// 수학 : 100
//		// 합계 : 300
//		// 평균 : 100.0
//		// 등수 : 0
//		String[] arr = str.split(",");
////		for(int i=0;i<arr.length;i++) {
////			System.out.println(arr[i]);
////		}
//		int n = Integer.parseInt(arr[0]);
////		int n1 = Integer.parseInt(arr[1]);
//		int n2 = Integer.parseInt(arr[2]);
//		int n3 = Integer.parseInt(arr[3]);
//		int n4 = Integer.parseInt(arr[4]);
//		int n5 = Integer.parseInt(arr[5]);
//		int n6 = Integer.parseInt(arr[6]);
//		int n7 = Integer.parseInt(arr[7]);
//		System.out.printf("학번 : %d\n",n);
//		System.out.printf("이름 : %s\n",arr[1]);
//		System.out.printf("국어 : %d\n",n2);
//		System.out.printf("영어 : %d\n",n3);
//		System.out.printf("수학 : %d\n",n4);
//		System.out.printf("합계 : %d\n",n2+n3+n4);
//		System.out.printf("평균 : %.2f\n",n5/3.0);
//		System.out.printf("등수 : %d\n",n7);
		
// ----------------------------------------------	

//		String str = "5";
//		int n = Integer.parseInt(str);  // 문자열 -> 숫자로 변경
//		System.out.println(n);
		
		// 두 수의 합,곱을 구하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요. >> 10,9");
//		String num = scan.next();
//		String[] arr = num.split(",");
//		int num = Integer.parseInt(arr[0]);
//		int num2 = Integer.parseInt(arr[1]);
//		System.out.println(num+num2);
		
		
		// split : 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		// charAt : 지정된 위치의 문자반환
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
		
		
		// concat : 문자열 합치기
//		String str = "안녕";
//		String str2 = "반가버";
//		System.out.println(str.concat(str2));
		
		
		// equals : 대소문자 구분 비교, equalsIgnoreCase : 대소문자 구분x 비교
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		if(str.equalsIgnoreCase(str2)) {  // equalsIgnoreCase : 대소문자 구분 x
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		if(str.equals(str3)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
// ----------------------------------------------		

//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone();  // 객체복사
//		Point p3 = new Point(p1);  // 객체복사
//		
//		// 값 변경
//		p1.x = 10;
//		p2.x = 100;
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
//		
//		String a = "a";
//		String b = "b";
//		a += b;
//		
//		for(int i=0;i<100;i++) {
//			a += i;
//		}
		
// ----------------------------------------------		
		
//		String txt = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		String txt2 = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라, 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		String txt3 = "안녕하세요"
//;		String str1 = new String(txt);
//		String str2 = new String(txt2);
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
// ----------------------------------------------		
		
//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		
//		if(s1.equals(s2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}
		
// ----------------------------------------------		
		
//		Person p1 = new Person(200101011111111L);
//		Person p2 = new Person(200101011111111L);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("다른 사람입니다.");
//		}

		
		
	}

}
