package solutionPackage;

public class BaeckJoon10798 {

	public static void main(String[] args) {
		
		
		
		 char[][] charArr = {
	                {'A','A','B','C','D','D'},
	                {'a','f','z','z',' ',' '},
	                {'0','9','1','2','1',' '},
	                {'a','8','E','W','g','6'},
	                {'P','5','h','3','k','x'}
	        };
		 
		 long beforeTime = System.currentTimeMillis();
		 
		 int value = 1;
		 int top = 0, left = 0, bottom = 4;
		 while(value <= 30) {
			 for(int i = top; i <= bottom; i++) {
				 System.out.printf("%c",charArr[i][left]);
				 value++;
			 }
			 left++;
			 for(int i = top; i <= bottom; i++) {
				 System.out.printf("%c",charArr[i][left]);
				 value++;
			 }
			 left++;
			 for(int i = top; i <= bottom; i++) {
				 System.out.printf("%c",charArr[i][left]);
				 value++;
			 }
			 left++;
			 for(int i = top; i <= bottom; i++) {
				 System.out.printf("%c",charArr[i][left]);
				 value++;
			 }
			 left++;
			 for(int i = top; i <= bottom; i++) {
				 System.out.printf("%c",charArr[i][left]);
				 value++;
			 }
			 left++;
			 for(int i = top; i <= bottom; i++) {
				 System.out.printf("%c",charArr[i][left]);
				 value++;
			 }
			 left++;
			 
			 
			 
		 }
		 
		 long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		 long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		 System.out.println("시간차이(m) : "+secDiffTime);
	
		 
		 
		 
		 
		 
		 
		 
	}

}
