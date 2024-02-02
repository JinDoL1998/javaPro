package days25;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author jinseong
 * @date 2024. 2. 2. - 오후 3:06:26
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * @content	DataInputStream/DataOutputStream
 */
public class Ex09 {

	public static void main(String[] args) {
		
		String name = "김진성";
		int kor=72, eng=59, math=80; 
		int total = kor + eng + math;
		double avg = total/3.0;
		boolean gender = false;
		
		// 한 학생 정보를 student.txt 파일 저장...
		String fileName = ".\\src\\days25\\student.txt";
		try (FileWriter fw = new FileWriter(fileName, true);
			 BufferedWriter bw = new BufferedWriter(fw)){
			
			String data = String.format("%s,%d,%d,%d,%d,%.2f,%b\n", 
					name, kor, eng, math, total, avg, gender);
			bw.append(data);
			bw.flush();
			System.out.println(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
