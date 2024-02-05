package days26;

import java.io.File;

public class Ex02_05 {

	public static void main(String[] args) {

		// days26
		//	ㄴ temp
		//		ㄴ a.txt
		//		ㄴ b.txt
		//		ㄴ subTemp
		//			ㄴ c.txt
		//			ㄴ d.txt

		String pathName = ".\\src\\days26\\temp";
		File p = new File(pathName);

		if(p.exists()) {
			// 삭제 안된 이유 : delete() 메서드는 하위 디렉토리가 없어야 삭제할 수 있다.
			// System.out.println(p.delete());
			directoryDelete(p);

		}

		System.out.println("end");

	} // main

	private static void directoryDelete( File f ) {
		// f 삭제되지 않았을 경우 while 반복
		while (  !f.delete() ) {  // true, false

			File[] list =   f.listFiles();
			for (int i = 0; i < list.length; i++) {   
				if (list[i].delete()) {
					System.out.printf("%s  삭제 완료!!!\n", list[i] );
				} else {
					directoryDelete( list[i] );
				} // if
			} //

		} // while
	}

} // class
