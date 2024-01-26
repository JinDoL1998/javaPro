package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 16. - 오전 11:01:29
 * @subject	1차원 배열 -> 2차원 배열 변경해서 코딩 수정
 * @content	
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		// 시험
		
		String name;
		int kor, eng, math, total;
		double avg;
		int rank;

		final int STUDENT_COUNT = 23;

		String [] names = new String[STUDENT_COUNT];
		
//		int [] kors = new int[STUDENT_COUNT];
//		int [] engs = new int[STUDENT_COUNT];
//		int [] maths = new int[STUDENT_COUNT];
//		int [] totals = new int[STUDENT_COUNT];
//		int [] ranks = new int[STUDENT_COUNT];
		
		int [][] infos = new int[STUDENT_COUNT][5];
		
		double [] avgs = new double[STUDENT_COUNT];
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;	// 실제 입력받은 학생 수
		char con = 'y';

		do {
			name = getName();
			kor = getScore();
			eng = getScore();
			math = getScore();

			total = kor + eng + math;
			avg = (double) total / 3;
			rank = 1;

			names[count] = name;
			
			// infos 2차원 배열 수정
			
			infos[count][0] = kor;
			infos[count][1] = eng;
			infos[count][2] = math;
			infos[count][3] = total;
			infos[count][4] = rank;
			avgs[count] = avg;

			count++;	// 1명

			System.out.printf("%d번학생 입력 계속 ? (y / Y)", count);
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while(Character.toUpperCase(con) == 'Y');
		
		// 등수처리
		procRank(infos, count);

		// 학생 정보 출력
		dispStudentInfo(names, infos, avgs, count);

	}
	
	// I = 0 , 1 2 3 4 5 6
	// 		1, 2,3,4,5,6
	/*
	 * 2 3,4,5,6
	 * 3 4,5,6
	 * 4 5,6
	 * 5 6
	 */
	private static void procRank(int[][] infos, int count) {
		
		for(int i = 0; i < count; i++) {
			infos[i][4] = 1;
			for(int j = 0; j < count; j++) {
				if(infos[i][3] < infos[j][3]) {
					infos[i][4]++;
				}
			}
			System.out.println(infos[i][4]);
		}
	}

	private static void dispStudentInfo(String[] names, int[][] infos, double[] avgs, int count) {

		System.out.printf("총 %d명 \n", count);
		for(int i = 0; i < count; i++) {
			System.out.printf("%d번 \t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n", i+1, names[i], infos[i][0], infos[i][1], infos[i][2], infos[i][3], avgs[i], infos[i][4]);
		}
	}
	
	// 랜덤하게 점수를 발생시키는 함수
	public static int getScore() {
		return(int)(Math.random()*101);
	}
	
	public static String getName() {
		String [] lastNames = {"김", "이", "박", "최", "권", "홍" };
		Random random = new Random();
		
		int index = random.nextInt(lastNames.length);	// 0<= int < 6
		String lastName = lastNames[index];	// 성
		
		// 이름
		char[] firstNames = new char[2];
		for(int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char)(random.nextInt('힣' - '가' + 1) + '가');
		}
		
		String name = lastName + firstNames[0] + firstNames[1];
		
		return name;
	}

} // class
