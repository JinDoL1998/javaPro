package days14;

public class Student {

	public Student() {
		
		
	}

	public Student(String name, int kor, int eng, int math, int total, double avg, int rank, int wrank) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
		this.wrank = wrank;
	}

	// field
	// [인스턴스 변수]
	public String name;
	public int kor, eng, math, total;
	public double avg;
	public int rank, wrank;

	// method
	public void dispInfo() {

		// int x; // 지역변수
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\t%d등\n", 
				name, 
				kor, 
				eng,
				math, 
				total, 
				avg, 
				rank,
				wrank);

		
	}

}
