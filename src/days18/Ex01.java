package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {

		String fileName = "D:\\Class\\Workspace\\JavaClass\\javaPro\\bin\\days01\\Ex01.class";
		int one = -1;
		FileReader reader = null;

		try {
			reader = new FileReader(fileName);
			
			while((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
