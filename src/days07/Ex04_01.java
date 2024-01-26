package days07;

/**
 * @author jinseong
 * @date 2024. 1. 9. - 오후 12:02:57
 * @subject
 * @content	
 */
public class Ex04_01 {

	public static void main(String[] args) {
		
		int [] kors = {99, 1, 100, -10, 101};
		String regex = "[1-9]?\\d | 100";
		
		
		for(int i = 0; i < kors.length; i++) {
			int kor = kors[i];
			
			if((kor + "").matches(regex)) {
				System.out.println(kor);
			}
			
		}
		
	}

}
