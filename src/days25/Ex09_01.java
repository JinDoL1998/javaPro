package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author jinseong
 * @date 2024. 2. 2. - 오후 3:06:26
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * @content	DataInputStream/DataOutputStream
 */
public class Ex09_01 {

	public static void main(String[] args) {
		
		String name = "김진성";
		int kor=72, eng=59, math=80; 
		int total = kor + eng + math;
		double avg = total/3.0;
		boolean gender = false;
		
		// 두번쨰 학생 정보를 student.txt 파일로 부터 읽어와서 출력
		String fileName = ".\\src\\days25\\student.txt";
		try (FileReader fr = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(fr)){
			
			br.readLine();	// 홍길동 학생의 정보 한 라인
			
			String data = br.readLine();
			String[] datas = data.split(",");
			name = datas[0];
			kor = Integer.parseInt(datas[1]);
			eng = Integer.parseInt(datas[2]);
			math = Integer.parseInt(datas[3]);
			total = Integer.parseInt(datas[4]);
			avg = Double.parseDouble(datas[5]);
			gender = Boolean.parseBoolean(datas[6]);
			
			System.out.printf("%s,%d,%d,%d,%d,%.2f,%b\n", 
					name, kor, eng, math, total, avg, gender);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
