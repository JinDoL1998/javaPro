package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex03_01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 직렬화
		 * 	  객체를 스트림으로 만드는 것
		 * 
		 * 2. 역직렬화
		 * 	  스트림을 객체로 만드는 것
		 * 
		 * 3. 객체를 직렬화해서 읽기/쓰기를 할 수 있는 바이트 스트림
		 * 	  ObjectInputStream		바이트스트림
		 * 	  ObjectOutputStream	
		 * 
		 */
		
		String name = ".\\src\\days26\\UserInfo.ser";
		
		try (FileInputStream fis = new FileInputStream(name);
			 ObjectInputStream ois = new ObjectInputStream(fis)){
			
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			System.out.println("> u1, u2, list 객체를 직렬화 시켜서 oos 파일로 저장완료!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
