package days19;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
		String[] answer = solution(my_str, n);
		
		// ["abc1Ad", "dfggg4", 556b"]
		System.out.println(Arrays.toString(answer));
		
	}
	
	public static String[] solution(String my_str, int n) {
        String[] answer = {};
        
        int arrayLength = (int) Math.ceil((double)my_str.length() / n);
        answer = new String[arrayLength];
        
        StringBuilder sb = new StringBuilder(my_str);
        /*
        answer[0] = sb.substring(0, 6); sb.delete(0, 6);
        answer[1] = sb.substring(0, 6); sb.delete(0, 6);
        answer[2] = sb.substring(0);
        */
        
        for(int i = 0; i < answer.length - 1; i++) {
        	answer[i] = sb.substring(0, n);	sb.delete(0, n);
        }
        answer[answer.length-1] = sb.substring(0);
        
        return answer;
    }
	
}
