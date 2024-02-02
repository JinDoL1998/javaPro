package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author jinseong
 * @date 2024. 2. 2. - 오후 3:06:26
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * @content	DataInputStream/DataOutputStream
 */
public class Ex10_01 {

	public static void main(String[] args) {
		
		String name = "김진성";
		int kor=72, eng=59, math=80; 
		int total = kor + eng + math;
		double avg = total/3.0;
		boolean gender = false;
		
		// 두번쨰 학생 정보를 student.txt 파일로 부터 읽어와서 출력
		String fileName = ".\\src\\days25\\student.dat";
		try (FileInputStream fis = new FileInputStream(fileName);
			 DataInputStream dis = new DataInputStream(fis)){
			
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			math = dis.readInt();
			total = dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();
			
			System.out.printf("%s,%d,%d,%d,%d,%.2f,%b\n", 
					name, kor, eng, math, total, avg, gender);
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
