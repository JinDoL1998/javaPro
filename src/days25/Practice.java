package days25;


import java.io.File;
import java.io.FileReader;


public class Practice {

	public static void main(String[] args) {

		String parent = ".\\src\\days25";
		String child = "student.dat";
		
		File readFile = new File(parent, child);
		
		try (FileReader fr = new FileReader(readFile)){
			int code;
			
			while((code = fr.read()) != -1) {
				System.out.printf("%c", (char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}	// main

} // class
