package days23;

import java.io.FileReader;
import java.util.Properties;

public class Ex10_01 {

	public static void main(String[] args) {
		
		String className;            
		String url;                  
		String user;                                                                   
		String password;
		
		String path = ".\\src\\days23\\jdbc.properties";
		
		Properties p = new Properties();
		
		try (FileReader fr = new FileReader(path);){
			p.load(fr);
			className = p.getProperty("className");
			url = p.getProperty("url");
			user = p.getProperty("uesr");
			password = p.getProperty("password");
			
			System.out.println(className);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
