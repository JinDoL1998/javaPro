package days14;

public class Tv {
	
	// 멤버변수(필드)
	public String color;
	public boolean power;
	public int channel;
	
	// 멤버함수(메서드)
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
		
	}
	
	public void channelDown() {
		channel--;
		
	}
	
}
