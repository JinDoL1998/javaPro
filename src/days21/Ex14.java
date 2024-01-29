package days21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days14.Student;
import days14.StudentManagement;

/**
 * @author jinseong
 * @date 2024. 1. 18. - 오후 2:45:18
 * @subject days11.Ex05_01.java
 * @content	Student 학생 클래스 수정
 */
public class Ex14 {

	public static void main(String[] args) throws IOException {

		final int STUDENT_COUNT = 23;

		String name;
		int kor, eng, math, total;
		double avg;
		int rank;

		// ArrayList 컬렉션 클래스 선언
		ArrayList list = new ArrayList();

		Scanner scanner = new Scanner(System.in);
		char con = 'y';

		do {
			System.out.printf("> %d번 이름, 국어, 영어, 수학 입력 ? ", list.size()+1);
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			math = scanner.nextInt();

			total = kor + eng + math;
			avg = (double) total / 3;
			rank = 1;

			Student s = new Student();

			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.math = math;
			s.total = total;
			s.avg = avg;
			s.rank = rank;

			list.add(s);

			System.out.printf("%d번학생 입력 계속 ? (y / Y)", list.size()+1);
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while(Character.toUpperCase(con) == 'Y');

		procRank(list);
		dispStudent(list);

	} // main

	private static void procRank(ArrayList list) {

		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			// s.total, s.rank
			s.rank = 1;
			
			for(int i = 0; i < list.size(); i++) {
				int targetTotal = ((Student)list.get(i)).total;
				if(s.total < targetTotal) s.rank++;
			}

		}

	}		
																
	private static void dispStudent(ArrayList list) {

		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			s.dispInfo();

		}

	}


} // class
