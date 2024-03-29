package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		int [] m = new int[3];

		m = appendArray(m);
		
		dispArray(m);
		
	}

	private static int[] appendArray(int[] m) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		char con = 'y';
		
		do {
			if(index == m.length) {
				int [] temp = new int[m.length + 3];
				for(int i = 0; i < m.length; i++) {
					temp[i] = m[i];
				}
				m = temp;
			}
			System.out.printf("> m[%d] 입력 ? ", index);
			m[index++] = scanner.nextInt();
			
			System.out.printf("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		System.out.println(" > " + Arrays.toString(m));
		return m;
	}

	private static void dispArray(int[] m) {
		
		System.out.println(Arrays.toString(m));
		
	}

}
