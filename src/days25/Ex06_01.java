package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex06_01 {

	public static void main(String[] args) {
		
		// 실행파일 복사 -> 바이트(이진)스트림
		// FileInputStream / FileOutputStream
		
		String sourceFile = "C:\\Program Files (x86)\\Kakao\\KakaoTalk\\KakaoTalk.exe";
		String copyFile = "D:\\copyTest\\KakotTalk.exe";
				
		fileCopyBinaryStream(sourceFile, copyFile);
		
	} // main;

	private static String fileCopyBinaryStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();
		final int BUFFER_SIZE = 1024;
		
		try (FileInputStream fis = new FileInputStream(sourceFile);
			 FileOutputStream fos = new FileOutputStream(copyFile);
			  BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
			  BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE)){
			
			byte[] b = new byte[BUFFER_SIZE];
			int readByteNumber;
			while ((readByteNumber = bis.read(b)) != -1) {
				bos.write(b, 0, readByteNumber);
			}
			bos.flush();
			
			System.out.println("파일복사 완료");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

} // class
