package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) throws IOException {

		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 3;		
		String [][] names = new String[CLASS_COUNT][STUDENT_COUNT];
		int [][][] infos = new int[CLASS_COUNT][STUDENT_COUNT][6];
		double [][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];

		char con = 'y'; 	
		int [] counts = new int[CLASS_COUNT];

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;	

		Scanner scanner = new Scanner(System.in);
		int ban;
		int banStudentCount = 0;	// 반당 입력받은 학생수
		int studentCount = 0;	// 전교학생수

		do {
			ban = scanner.nextInt();
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank = 1;
			wrank = 1;
			
			names[ban][banStudentCount] = name;
			infos[ban][banStudentCount][0] = kor;
			infos[ban][banStudentCount][1] = eng;
			infos[ban][banStudentCount][2] = mat;
			infos[ban][banStudentCount][3] = tot;
			infos[ban][banStudentCount][4] = rank;
			infos[ban][banStudentCount][5] = wrank;
			
			avgs[ban][banStudentCount] = avg;
			
			banStudentCount++;
			
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			

		} while (Character.toUpperCase(con) == 'Y');
		
		dispStudentInfo(names, infos, avgs, banStudentCount, ban);
		
		procRanks(infos, banStudentCount);
		
		procWranks(infos, studentCount);

	}

	private static void procWranks(int[][][] infos, int studentCount) {
		// TODO Auto-generated method stub
		
	}

	private static void procRanks(int[][][] infos, int banStudentCount) {
		// TODO Auto-generated method stub
		
	}

	private static void dispStudentInfo(String[][] names, int[][][] infos, double[][] avgs, int banStudentCount,
			int ban) {
		
		for(int i = 0; i < infos.length; i++) {
			for(int j = 0; j < infos[i].length; j++	) {
				for (int k = 0; k < infos[j].length; k++) {
					
					System.out.printf("%d반 %d번 : %s\t%d\t%d\t%d\t%d\t%f\t%d\t%d", 
							ban, banStudentCount, names[ban][banStudentCount], infos[i][j][0], infos[i][j][1], infos[i][j][2], infos[i][j][3],
							avgs[i][j], infos[i][j][4], infos[i][j][5]);
					
				}
			}
		}
		
	}

	private static int getScore() {
		return (int)Math.random() * 101;
	}

	private static String getName() {

		String[]  lastNames = {"김","이", "박", "최", "권", "홍"};  
		Random rnd = new Random();

		int index = rnd.nextInt(lastNames.length); 
		String lastName = lastNames[index];  // 성

		// 이름
		char [] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char)(rnd.nextInt('힣' - '가' + 1) + '가');
		}

		String name = lastName + firstNames[0] + firstNames[1];	   
		return name;

	}

} // class
