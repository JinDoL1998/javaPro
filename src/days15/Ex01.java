package days15;

import java.io.IOException;
import java.util.Scanner;

import days11.Ex05_01;
import days14.Student;

/**
 * @author jinseong
 * @date 2024. 1. 19. - 오전 7:50:39
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 3반 30명 학생 코딩. 
		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 3;

		// 2차원 - 클래스 배열 선언
		Student [][] students = new Student[CLASS_COUNT][STUDENT_COUNT];

		char con = 'y'; 
		// int count = 0;
		// counts[0] 1반 학생수
		// counts[1] 2반 학생수
		// counts[2] 3반 학생수
		int [] counts = new int[CLASS_COUNT];

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner scanner = new Scanner(System.in);

		int ban ;

		do {
			//
			System.out.printf("> 반 입력 ? ");
			ban = scanner.nextInt();

			System.out.printf(
			"> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? "
					, ban, counts[ban-1]+1 );

			// 이,국,영,수 입력
			name = Ex05_01.getName();
			kor = Ex05_01.getScore();
			eng = Ex05_01.getScore();
			mat = Ex05_01.getScore();
			// 총,평,등,전등 계산
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			wrank = rank = 1;
			
			// students 2차원배열에 입력받은 학생Student 저장
			/*
			Student s = new Student();
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.rank = rank;
			s.wrank = wrank;
			s.avg = avg;
			*/
			Student s = new Student(name, kor, eng, mat, tot, avg, rank, wrank);

			// 클래스 복사
			students[ban-1][ counts[ban-1] ] = s;
			
			counts[ban-1]++;
			// 입력 계속 
			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y' );

		// 정보 출력
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명 ]\n", i+1, counts[i]);
			for (int j = 0; j < counts[i] ; j++) {
				students[i][j].dispInfo();
			}
		}
	} // main

} // class






















