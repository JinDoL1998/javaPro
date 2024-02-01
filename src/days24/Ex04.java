package days24;

public class Ex04 {

	public static void main(String[] args) {
		
//		Button callButton = new Button();
//		callButton.setListener(new CallListener());
//		callButton.touch();
//		
//		Button messageButton = new Button();
//		callButton.setListener(new MesssageListener());
//		callButton.touch();
		
	} // main

} // class

class Button{
	
	// 필드
	OnClickListener listener;
	
	// 위 필드의 Setter
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.OnClick();
	}


	// 중첩 인터페이스
	interface OnClickListener {
		// 상수, 추상메서드, Default 메서드, String 메서드
		void OnClick();
	}
	
	
}

//Button 클래스 안의 OnClickListener 인터페이스를 구현한 클래스 선언
//class CallListener implements Button.OnClickListener{
//
//	@Override
//	public void onClick() {
//		System.out.println("전화를 건다.");
//	}
//	
//}
//
//class MessageListener implements Button.OnClickListener{
//
//	@Override
//	public void onClick() {
//		System.out.println("문자 메시지를 보낸다.");
//	}
//	
//}

