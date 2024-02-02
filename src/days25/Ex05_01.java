package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex05_01 {

	public static void main(String[] args) {
		
		// 버퍼 기능 있는 보조 스트림을 사용해서 파일 복사
		
		String sourceFile = ".\\src\\days25\\Ex01.java";
		String copyFile = ".\\src\\days25\\Ex01_Copy.java";
		
		// > 복사 처리 시간 : 90560800(ns)
		// > 복사 처리 시간 :  1159300(ns)
		long start = System.nanoTime();
		fileCopyTextStream(sourceFile, copyFile);
		
		final int BUFFER_SIZE = 1024;
		try (FileReader fr = new FileReader(sourceFile);
			 FileWriter fw = new FileWriter(copyFile);
			 BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);
			 BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);){
			// char -> int
			/*
			int code;
			while ((code = fr.read()) != -1) {
				System.out.printf("%c", (char)code);
				// fw.append(code);	char, CharSequence
				fw.write(code);
				// fw.flush();
			} // while
			fw.flush();
			*/
			
			/* 한 라인 단위 처리...
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line);
			}
			*/
			
			// 1035
			// 1024
			
			//	 11
			char[] cbuf = new char[BUFFER_SIZE];
			int readCharNumber;
			while( ( readCharNumber = br.read(cbuf)) != -1 ) {
				bw.write(cbuf, 0, readCharNumber);
			}
			
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

