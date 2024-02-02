package days25;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author jinseong
 * @date 2024. 2. 2. - 오후 3:06:26
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * @content	DataInputStream/DataOutputStream
 * 			보조스트림
 */
public class Ex10 {

	public static void main(String[] args) {
		
		String name = "김진성";
		int kor=72, eng=59, math=80; 
		int total = kor + eng + math;
		double avg = total/3.0;
		boolean gender = false;
		
		// 한 학생 정보를 student.txt 파일 저장...
		String fileName = ".\\src\\days25\\student.dat";	// data		.ini(=초기설정파일)
		try (FileOutputStream fos = new FileOutputStream(fileName);
			 DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(total);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
