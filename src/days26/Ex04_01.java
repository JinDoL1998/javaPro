package days26;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex04_01 {

	public static void main(String[] args) {

		String pathName = ".\\src\\days26\\Child.ser";
		try (FileInputStream in = new FileInputStream(pathName);
			 ObjectInputStream ois = new ObjectInputStream(in)){
			
			Child c = (Child) ois.readObject();
			String name = c.name;
			int age = c.age;
			
			System.out.printf("name = %s, age = %d\n", name, age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
