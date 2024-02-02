package days25;

import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		
		String parent = ".\\src\\days25";
		String child = "Ex01.java";
		
		// [파일정보]
		// File 클래스 - 파일, 폴더(디렉토리)을 다루는 여러 기능(메서드)이 구현된 클래스
		// 								생성, 파일명 변경, 삭제, 정보등등
		// String path = dir + "\\" + fName;
		File openFile = new File(parent, child);
		
		System.out.println(openFile.length() + "bytes");
		// 1706836087637
		Date d = new Date(openFile.lastModified());
		System.out.println(d.toLocaleString());
		
		
		
		// File + 읽기 + 문자 스트림 == FileReader
		try (FileReader fr = new FileReader(openFile)){
			// char -> int
			int code;
			while ((code = fr.read()) != -1) {
				System.out.printf("%c", (char)code);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
