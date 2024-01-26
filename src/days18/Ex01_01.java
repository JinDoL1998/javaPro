package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jinseong
 * @date 2024. 1. 24. - 오전 10:07:35
 * @subject	한 문자x
 * @content	한 라인씩 처리
 * 			버퍼 기능 O 
 * 			[A][B][][][\r][\n][A][B][][][\r][\n]
 * 			readLine();
 * 			BufferedReader 클래스 ( 보조 스트림 )
 * 			라인번호 붙이기
 */
public class Ex01_01 {

	public static void main(String[] args) {

		String fileName = "D:\\Class\\Workspace\\JavaClass\\javaPro\\bin\\days01\\Ex01.class";
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		int lineNumber = 0;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			while((line = br.readLine()) != null ) {
				System.out.printf("%d: %s\n", ++lineNumber, line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
