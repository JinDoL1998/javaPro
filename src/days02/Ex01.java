package days02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		/*
		 * n 변수(variable)
		 * 'n' 한 문자
		 * "n" 문자열 = 'n' + '\0'
		 */
		
		String name = "김진성";
		double height = 185.22;
		
		// The method printf(String, Object[]) in the type PrintStream is not applicable for the arguments (String, String, double)
		System.out.printf("이름 : \"%s\", 키 : \"%.2fcm\"", name, height);
		
		
			
			
	}		
	
}
