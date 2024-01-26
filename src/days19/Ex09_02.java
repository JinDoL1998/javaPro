package days19;

import java.io.FileReader;
import java.util.Arrays;

public class Ex09_02 {

	public static void main(String[] args) {

		// days18.Ex01.java 자바파일 안에 있는
		// 알파벳을 대문자 소문자 숫자가 몇개인지 
		// 배열에 저장 후 ### 막대그래프 그리기.


		int [] counts = new int[2];
		int [][] countsAlphabetCase = new int[2]['Z' - 'A' + 1];
		// 0행 대문자 갯수 저장	
		// 1행 소문자 갯수 저장

		String fileName = "\\src\\days18\\Ex01.java";

		String key = "user.dir";
		String userDir = System.getProperty(key);
		String path = userDir.concat(fileName);

		try(FileReader fr = new FileReader(path);) {

			int code;
			char one;
			// read() : EOF => -1반환
			while( (code = fr.read()) != -1) {
				one = (char)code;

				if(Character.isUpperCase(one)) {
					// System.out.println(one - 'A');
					countsAlphabetCase[0][one - 'A']++;
					counts[0]++;
				}
				else if(Character.isLowerCase(one)) {
					countsAlphabetCase[1][one - 'a']++;
					counts[1]++;
				}

			} // while

			System.out.println(Arrays.toString(counts));

			 for (int i = 0; i < counts.length; i++) { // 행
				 String str = null;
					switch (i) {
					case 0:
						str = "대문자";
						break;
					case 1:
						str = "소문자";
						break;
					default:
						break;
					}
		            System.out.printf("[%s출력]\n", str);
		            for (int j = 0; j < countsAlphabetCase[i].length; j++) {
		               System.out.printf("'%c': %s(%d)\n"
		                     , i==0 ? 'A'+j : 'a'+j  
		                     ,  "#".repeat( countsAlphabetCase[i][j] ) , countsAlphabetCase[i][j]);               
		            }
		         }

			/*
			
			*/
			


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
