package days26;

import java.io.File;

public class Ex02_01 {

	public static void main(String[] args) {
		
		// C:\E\Class\Workspace\JavaClass\javaPro 폴더
		String currentDirectory = System.getProperty("user.dir");
		// System.out.println(currentDirectory);
		
		File p = new File(currentDirectory);
		p.isDirectory();	// true
		p.isFile();			// false
		
		String[] list = p.list();
		for(int i = 0; i < list.length; i++) {
			// System.out.println(list[i]);
			File c = new File(p, list[i]);
			System.out.printf("%s\t%s\t%d\n", c.isFile() ? "파일":"[폴더]", c.getName(), c.length());
		}
		
		System.out.println("-".repeat(30));
		File[] fList = p.listFiles();
		for(int i = 0; i < fList.length; i++) {
			System.out.printf("%s\t%s\t%d\n", fList[i].isFile() ? "파일":"[폴더]", fList[i].getName(), fList[i].length());
		}
		
	} // main

} // class
