package days26;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.stream.Stream;

/**
 * @author user2024. 2. 5.
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {

		int [] score = {
				// 번호 국    영   수
				1, 100, 90, 90,    // 4*4
				2, 70 , 90,100,
				3, 100,100,100,
				4, 70 , 60, 80,
				5, 70 , 90,100
		};

		String name = ".\\src\\days26\\score.dat";
		String mode = "rw";

		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			for (int i = 0; i < score.length; i++) {
				Long fp = raf.getFilePointer();

				System.out.printf("> 현재 파일 포인터 : %d - [%d]\n", fp, score[i]);
				raf.writeInt(score[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() ); // 13,10 제거

		// 모든 학생의 번호, 국, 영, 수 성적 정보를 출력... (score.dat)
		int no, kor, eng, math;
		int total;
		double avg;

		try (RandomAccessFile raf = new RandomAccessFile(mode, mode)){
			int studentCount = score.length / 4;
			for(int i = 0; i < studentCount; i++) {
				no = raf.readInt();	// no
				kor = raf.readInt();	// kor	
				eng = raf.readInt();	// eng
				math = raf.readInt();	// math
				total = kor + eng + math;
				avg = total / 3.0;
				System.out.printf("번호 : %d, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f\n"
						,no, kor, eng, math, total, avg);
			}



		} catch (Exception e) {
			e.printStackTrace();
		}	

		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다.");
		System.in.read(); 
		System.in.skip( System.in.available() ); // 13,10 제거

		System.out.println("-".repeat(30));
		// 문제 
		// ㄱ. 3번 학생의 수학점수 (100 -> 20)점 수정
		// ㄴ. 3번 학생만 성적 정보를 출력
		try (RandomAccessFile raf = new RandomAccessFile(mode, mode);){
			long pos = 4 * 4 * 2 + 4+4+4;	// 44	  
			raf.seek(pos);
			raf.writeInt(20);

			pos = 4*4*2;	// 3번학생의 위치값
			raf.seek(32);	// 3번학생 번호

			no = raf.readInt();		// no
			kor = raf.readInt();	// kor	
			eng = raf.readInt();	// eng
			math = raf.readInt();	// math
			total = kor + eng + math;
			avg = total / 3.0;
			System.out.printf("번호 : %d, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f\n"
					,no, kor, eng, math, total, avg);

		} catch (Exception e) {
			e.printStackTrace();
		}	



	} // main

} // class
