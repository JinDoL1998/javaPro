package days26;

import java.io.File;

public class Ex02_04 {

	public static void main(String[] args) {
		
		String pathName = ".\\src\\days26";
		// days26 폴더 안에 upload 폴더 생성.
		File upload = new File(pathName, "upload");
		
		// System.out.println(upload.exists()); // false
		if(!upload.exists()) {
			System.out.println(upload.mkdir());
			// mkdirs() : days26\다른 서브 디렉토리\test\ upload => test폴더 없으면 test폴더까지 만들어버림
			
			// createTempFile("work", ".tmp");
			//			임시파일
			//	C:\\windows\\TEMP	파일생성
		} else {
			// 폴더가 존재하면 삭제 해 보자
			System.out.println(upload.delete());
			// deleteOnExit() : 응용 프로그램이 종료될 때 파일삭제(임시 파일 삭제)
		}
		
	} // main

} // class
