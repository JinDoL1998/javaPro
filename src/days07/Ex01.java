package days07;

public class Ex01 {

	public static void main(String[] args) {

		for(int i = 1; i <=  9; i++) {
			for(int j = 2; j <= 9; j++){
				System.out.printf("%dx%d=%02d ", i, j, i * j);
			}
			System.out.println();
		}

	}

}
