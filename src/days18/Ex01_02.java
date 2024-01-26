package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jinseong
 * @date 2024. 1. 24. - 오전 10:07:35
 * @subject	try ~ resources 문
 * @content	

 */
public class Ex01_02 {

	public static void main(String[] args) {

		String fileName = "D:\\Class\\Workspace\\JavaClass\\javaPro\\bin\\days01\\Ex01.class";
		String line = null;
		int lineNumber = 0;
		
		try (FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);	
			){
			
			while((line = br.readLine()) != null ) {
				System.out.printf("%d: %s\n", ++lineNumber, line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try ~ resources 문에 의해서
			// 자동으로 close() 시킨다.
		}

	} // main

} // class
