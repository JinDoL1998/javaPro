package days24;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Ex01_01 {

	public static void main(String[] args) {
		
		/*
		 *     String user = "admin",    password = "1234"
    			를   Properties를 사용해서  user.properties 파일로 
    			저장하고, 읽어오는 코딩을 하세요.  
		 */
		
		String user = "admin";
		String password = "1234";
		String path = ".\\src\\days24\\user.properties";
		
		Properties p = new Properties();
		p.setProperty("user", user);
		p.setProperty("password", password);
		try (FileWriter fw = new FileWriter(path);){
			p.store(fw, "connection");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
