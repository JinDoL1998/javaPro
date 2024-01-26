package days08;

public class Ex04_03 {

	public static void main(String[] args) {
		
		// 문제
		//
		
		// double result = recursivePow(2, -5);
		double result = pow(2, -3);
		System.out.println(result);
		
	
	}
	
	// 일반
	private static double pow(int num, int mulCount) {
		
		if(mulCount >= 0) return Math.pow(num, mulCount);
		
		else {
			double result = 1.0;
			for(int i = 0; i > mulCount; i--) {
				result *= (1.0 / num);
			}
			return result;
			
		}
	}
	
	// 재귀
	private static double recursivePow(int num, int mulCount) {
		
		if (mulCount == 0) {
        
            return 1;
        } else if (mulCount > 0) {
            
            return num * recursivePow(num, mulCount - 1);
        } else {
            
            return 1.0 / (num * recursivePow(num, -mulCount - 1));
        }
		
	}

}
