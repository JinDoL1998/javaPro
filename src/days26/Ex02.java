package days26;

import java.io.File;
import java.io.IOException;

/**
 * @author jinseong
 * @date 2024. 2. 5. 오전 11:57:38
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		// [File 클래스]
		// -파일 + 디렉토리
		String pathName = ".\\src\\days26\\Ex01.java";
		// String pathName = ".\\src\\days26";
		
		File f = new File(pathName);
		
		System.out.println(f.getParent());		// ".\src\days26" : String
		
		// File f = new File(".\\src\\days26");
		System.out.println(f.getParentFile());	// 부모 file
		
		// .\src\days26\Ex01.java
		System.out.println(f.getPath());			// 경로
		// C:\E\Class\Workspace\JavaClass\javaPro\.\src\days26\Ex01.java
		System.out.println(f.getAbsolutePath());	// 절대 경로
		// C:\E\Class\Workspace\JavaClass\javaPro\src\days26\Ex01.java
		System.out.println(f.getCanonicalPath());	// 표준 경로
		
		System.out.println(f.isFile());		 // 파일이니?	true
		System.out.println(f.isDirectory()); // 폴더니?		false
		System.out.println(f.length());	// 2712byte
		System.out.println(f.exists()); // true
		
		// OS에서 사용하는 경로 구분자	;
		System.out.println(f.pathSeparator);
		
		// OS에서 사용하는 이름 구분자	\
		System.out.println(f.separator);
		
		// 전체 경로 속에서 파일명 얻어오는 메서드 Ex01.java
		String fileName = f.getName();
		System.out.println(fileName);
		
		// Ex01.java
		// 확장자(.java)를 제외한 파일명	"Ex01"
		// 확장자만 필요					".java"
		int pos = fileName.indexOf(".");
		System.out.println((fileName.substring(0, pos)));
		System.out.println(fileName.substring(pos));
		
	} // main

} // class
