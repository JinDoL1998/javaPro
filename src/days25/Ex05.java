package days25;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex05 {

	public static void main(String[] args) {
		
		// 텍스트파일 복사
		// 원본파일을 읽어서	FileReader
		// 복사파일에 쓰기		FileWriter
		String sourceFile = ".\\src\\days25\\Ex01.java";
		String copyFile = ".\\src\\days25\\Ex01_Copy.java";
		
		// > 복사 처리 시간 : 83242400(ns)
		fileCopyTextStream(sourceFile, copyFile);
		
		try (FileReader fr = new FileReader(sourceFile);
			 FileWriter fw = new FileWriter(copyFile)){
			long start = System.nanoTime();
			// char -> int
			int code;
			while ((code = fr.read()) != -1) {
				System.out.printf("%c", (char)code);
				// fw.append(code);	char, CharSequence
				fw.write(code);
				// fw.flush();
			} // while
			fw.flush();
			System.out.println("파일복사 완료");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void fileCopyTextStream(String sourceFile, String copyFile) {
		
		
		
	}

}

