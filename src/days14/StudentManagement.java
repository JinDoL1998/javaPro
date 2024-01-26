package days14;

public class StudentManagement {
	
	// 등수를 처리하는 메서드
	public static void procRank(Student[] students, int count) {
		
		for(int i = 0; i < count; i++) {
			// students[i].total;
			students[i].rank = 1;
			for (int j = 0; j < count; j++) {
				if(students[i].total < students[j].total) students[i].rank++;
			}
		}
		
	}
	
}
