package j0123;

public class Person {
	
	long id;  // 주민번호
	String name;  // 이름
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	// 비교
	@Override
	public boolean equals(Object obj) {  // obj : 비교대상 객체
		if(obj!=null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	@Override
	// Object 클래스 메서드를 재정의 - 주소값이 아닌, id 값 출력
	public String toString() {
		return id+"";
	}

	
	
	
}
