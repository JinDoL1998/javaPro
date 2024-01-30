package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import days11.Ex05_01;
import days14.Student;

public class Ex11_01 {

	public static void main(String[] args) throws IOException {

		// 시험
		// 1반 30명 * 3반
		// days15.Ex01.java 참고
		// 컬렉션 클래스 사용

		ArrayList class1List = new ArrayList();	// sistList.get(0)
		ArrayList class2List = new ArrayList(); // sistList.get(1)
		ArrayList class3List = new ArrayList(); // sistList.get(2)
		
		ArrayList sistList = new ArrayList();

		sistList.add(class1List);
		sistList.add(class2List);
		sistList.add(class3List);

		Scanner scanner = new Scanner(System.in);

		String name;
		int kor, eng, math, total, rank, wrank;
		double avg;

		char con = 'y'; 
		int ban;

		// 입력
		do {
			//
			System.out.printf("> 반 입력 ? ");
			ban = scanner.nextInt();

			// 입력할 반의 ArrayList
			ArrayList classList = ((ArrayList) sistList.get(ban-1));

			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? "
					, ban, classList.size()+1 );

			// 이,국,영,수 입력
			name = Ex05_01.getName();
			kor = Ex05_01.getScore();
			eng = Ex05_01.getScore();
			math = Ex05_01.getScore();
			// 총,평,등,전등 계산
			total = kor + eng + math;
			avg = (double)total / 3;
			wrank = rank = 1;

			Student s = new Student();
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.math = math;
			s.total = total;
			s.avg = avg;
			s.rank = rank;

			classList.add(s);


			// 입력 계속 
			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y' );

		// 정보 출력
		dispStudentInfo(sistList);

	} // main

	private static void dispStudentInfo(ArrayList sistList) {
		
		// int totalStudents = sistList.stream().mapToInt(ArrayList::size).sum();
		// System.out.printf("\t\t 학생 정보 출력 (%d명)\n", totalStudents);
		int totalStudents = 0;
		
		int ban = 1;
		Iterator ir = sistList.iterator();
		while (ir.hasNext()) {
			ArrayList classList = (ArrayList) ir.next();
			totalStudents += classList.size();
			System.out.println("=".repeat(70));
			System.out.printf("[%d반 학생 : %d명 ]\n", ban++, classList.size());
			//
			Iterator ir2 = classList.iterator();
			while (ir2.hasNext()) {
				Student s = (Student) ir2.next();
				s.dispInfo();
				
			}

		}
		System.out.printf("\t\t 학생 정보 출력 (%d명)\n", totalStudents);

	}

} // class
