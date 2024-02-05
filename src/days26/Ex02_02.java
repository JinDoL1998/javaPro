package days26;

import java.io.File;
import java.io.FilenameFilter;

public class Ex02_02 {

	public static void main(String[] args) {
		
		String pathName = ".\\src\\days26";
		// days26 폴더안에 있는 자바파일(.java)만 출력
		// days26 파일안에 있는 자바파일(.dat)만 출력
		
		File f = new File(pathName);
		/*
		File[] list = f.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File d, String n) {
				return n.endsWith(".dat");
			}
		});
		*/
		
		File[] list = f.listFiles((d, n) -> n.endsWith(".java"));
		for( File c : list) {
			System.out.println(c.getName());
		}
		
		/* [1]
		File [] list = f.listFiles();
		for(int i = 0; i< list.length; i++) {
			if(list[i].isFile()) {
				String fileName = list[i].getName();
				int pos = fileName.indexOf(".");
				String ext = fileName.substring(pos);
				if(ext.equals(".java")) {
					System.out.println(fileName);
				}
			}
		}
		*/
		
		
		
	}// main

}// class
