package days14;

/**
 * @author jinseong
 * @date 2024. 1. 18. - 오전 10:25:17
 * @subject Tv 클래스 선언 -> 객체 생성 후 사용.
 * @content	
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// 객체 tv1 선언
		Tv tv1 = null;
		
		// 객체를 생성하는 코딩, 인스턴스화
		tv1 = new Tv();
		
		// 필드가 초기화 X
		/*
		System.out.println(tv1.color);		// null
		System.out.println(tv1.channel);	// 0
		System.out.println(tv1.power);		// false
		*/
		
		// 객체명, 필드명
		// 배열명[index]
		
		//
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("현재 채널 : " + tv1.channel);
		
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		System.out.println("end");
		
		
	}

}
