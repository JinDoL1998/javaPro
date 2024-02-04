package days25;

import java.io.BufferedReader;
import java.io.FileReader;

public class Practice_1 {

	public static void main(String[] args) {
		
		String name = "김진성";
		int kor=72, eng=59, math=80; 
		int total = kor + eng + math;
		double avg = total/3.0;
		boolean gender = false;
		
		String fileName = ".\\src\\days25\\student.dat";
		try (FileReader fr = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(fr)){
			
			name = br.readLine();
			kor = Integer.parseInt(br.readLine());
			eng = Integer.parseInt(br.readLine());
			math = Integer.parseInt(br.readLine());
			total = Integer.parseInt(br.readLine());
			avg = Double.parseDouble(br.readLine());
			gender = Boolean.parseBoolean(br.readLine());

			System.out.printf("%s, %d, %d, %d, %d, %.2f, %b\n"
								,name, kor, eng, math, total, avg, gender);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
