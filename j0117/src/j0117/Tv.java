package j0117;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUP(){
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
}
