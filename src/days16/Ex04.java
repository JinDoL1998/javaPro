package days16;

import days14.Tv;

public class Ex04 {

	public static void main(String[] args) {
		
		// 기존 Tv
		// 자막 가능 o + 새로운 Tv 필요
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.dispCation("Hello World~");
		ctv.caption = true; // 자막 On
		ctv.dispCation("Hi~");
	}

} // class

class CaptionTv extends Tv{
	
	// 필드
	boolean caption; // 자막기능 on(true)/off(false);
	
	// 메서드
	void dispCation(String text) {
		if(this.caption) System.out.println(text);
	}
	
}
