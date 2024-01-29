package days14;

import java.io.IOException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		
		// 한반에 30명 학생 - 이, 국, 영, 수, 총, 평, 등 성적처리
		// Student 클래스 배열 처리. + ArrayList 컬렉션 클래스
		final int STUDENT_COUNT = 23;
		
		String name;
		int kor, eng, math, total;
		double avg;
		int rank;
		
		Student[] students = new Student[STUDENT_COUNT];
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;	// 실제 입력받은 학생 수
		char con = 'y';
		
		do {
			System.out.print("> 이름, 국어, 영어, 수학 입력 ? ");
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			math = scanner.nextInt();

			total = kor + eng + math;
			avg = (double) total / 3;
			rank = 1;

			students[count] = new Student();
			
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].math = math;
			students[count].total = total;
			students[count].avg = avg;
			students[count].rank = rank;

			count++;	

			System.out.printf("%d번학생 입력 계속 ? (y / Y)", count);
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while(Character.toUpperCase(con) == 'Y');
		
		StudentManagement.procRank(students, count);
		
		dispStudentInfo(students, count);
		
	} // main
	


	private static void dispStudentInfo(Student[] students, int count) {
		System.out.printf("총 %d명 \n", count);
		for(int i = 0; i < count; i++) {
			System.out.printf("%d번\t", i+1);
			students[i].dispInfo();
			
			/*
			System.out.printf("%d번 \t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n", i+1, students[i].name, students[i].kor, students[i].eng,
					students[i].math, students[i].total, students[i].avg, students[i].rank);
			*/
			
		}
		
	}

}
