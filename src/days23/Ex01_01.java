package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import days11.Ex05_01;
import days14.Student;

public class Ex01_01 {

	public static void main(String[] args) throws IOException {
		
		ArrayList class1List = new ArrayList();
		ArrayList class2List = new ArrayList();
		ArrayList class3List = new ArrayList();
		
		ArrayList sistList = new ArrayList();
		
		sistList.add(class1List);
		sistList.add(class2List);
		sistList.add(class3List);
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int kor, eng, math, total;
		double avg;
		int rank, wrank;
		
		char con = 'y';
		
		do {
			int ban;
			System.out.printf("입력할 반 : ");
			ban = scanner.nextInt();
			
			ArrayList classList = (ArrayList) sistList.get(ban-1);
			
			System.out.printf("%d반 %d번 학생 이름, 국어, 영어, 수학 점수 입력 : "
									,ban , classList.size()+1);
			
			name = Ex05_01.getName();
			kor = Ex05_01.getScore();
			eng = Ex05_01.getScore();
			math = Ex05_01.getScore();
			
			total = kor + eng + math;
			avg = total / 3.0;
			
			rank = 1;
			wrank = 1;
			
			Student student = new Student(name, kor, eng, math, total, avg, rank, wrank);
			
			classList.add(student);
			
			System.out.print("학생 계속 입력 ? (y/Y)");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con) == 'Y');
		
		procRank(sistList);
		
		dispStudentInfo(sistList);
		
	}
	
	
	
	private static void procRank(ArrayList sistList) {
		
		// Collections.sort(rank, Collections.reverseOrder());
		// 랭크로 내림차순해서 classList rank(반등수) sistRank(전교등수)
			
		
		
	}



	private static void dispStudentInfo(ArrayList sistList) {
		
		int ban = 1;
		Iterator iterator = sistList.iterator();
		while (iterator.hasNext()) {
			ArrayList classList = (ArrayList) iterator.next();
			System.out.printf("[%d반 %d명]", ban++, classList.size());
			Iterator iterator2 = classList.iterator();
			while (iterator2.hasNext()) {
				Student student = (Student) iterator2.next();
				student.dispInfo();
				
			}
		}
		
	}

}
