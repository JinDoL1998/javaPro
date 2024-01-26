package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 9. - 오전 10:08:17
 * @subject
 * @content	
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {

		char ch, con;
		int rpsCom, rpsUser;
		String[] rpsString = new String[4];
		rpsString[0] = " ";
		rpsString[1] = "가위";
		rpsString[2] = "바위";
		rpsString[3] = "보";
		
		String strUser;
		String regex = "[1-3]";

		Scanner scanner = new Scanner(System.in);



		do {
			
			rpsCom = (int) (Math.random() * 3) + 1;
			
			do {
				System.out.print("가위(1)바위(2)보(3) 입력 : ");
				strUser = scanner.next();
			} while ( !strUser.matches(regex) );
			
			rpsUser = Integer.parseInt(strUser);
			
			System.out.printf("컴퓨터 : %d(%s)\n", rpsCom, rpsString[rpsCom]);
			System.out.printf("사용자 : %d(%s)\n", rpsUser, rpsString[rpsUser]);
			
			
			switch (rpsUser - rpsCom) {
			case -2: case 1:
				System.out.println("사용자 승리");
				break;
			case -1: case 2:
				System.out.println("컴퓨터 승리");
				break;
			default:
				System.out.println("무승부");
				break;

			}

			System.out.print("\n\n계속할거니 ? ");

			con = (char) System.in.read();
			System.in.skip(System.in.available());


		} while (Character.toUpperCase(con) == 'Y');

		scanner.close();
		
	}

}
