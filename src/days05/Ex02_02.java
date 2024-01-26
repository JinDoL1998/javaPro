package days05;

public class Ex02_02 {

	public static void main(String[] args) {
		
		// 함수(메서드) 빠져나갈때	return문
		// 제어문 빠져나갈떄		break문
		
		int kor = 98;
		
		switch ( kor / 10 ) {
		// jdk 14~ case10,9: 가능
        case 10:   
        case 9:
           System.out.println("수");
           break;
           
        case 8:
           System.out.println("우");
           
        case 7:
           System.out.println("미");
           
        case 6:
           System.out.println("양");
           
        default:
           System.out.println("가");
           

        }
		
	}

}
