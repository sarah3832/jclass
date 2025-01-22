package star;

abstract public class Unit {  // 추상메서드가 있을시, abstract 넣어야 에러안남
	
	int x, y;
	
	abstract void move(int x,int y);  // 추상메서드 
	void stop() {
		System.out.println("자리에 멈춤!");
	}

	
	
}
