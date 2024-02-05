package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex02_03 {
	// 수정
	public static void main(String[] args) {

		
		String pathName = ".\\src\\days25";
		String keyword = "source";

		File parent = new File(pathName);
		File [] list = parent.listFiles((dir, name) -> name.endsWith(".java")); //listFiles 배열 사용.

		File child = null;
		int lineNumber = 1;
		String line = null;
		for (int i = 0; i < list.length; i++) {
			child = list[i];
			lineNumber = 1;
			String fileName = child.getName();
			System.out.printf("--------- %s --------\n", fileName);

			try (FileReader fr = new FileReader(child);
					BufferedReader br = new BufferedReader(fr)){
				while ((line = br.readLine()) != null) {
					if(line.contains(keyword)) {
						line.replaceAll(keyword, "["+keyword+"]");
						System.out.printf("%d : %s\n", lineNumber, line);
					}
					lineNumber++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} 

	} // main
}
