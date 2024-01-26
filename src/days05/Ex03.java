package days05;

import java.util.Scanner;

/**
 * @author jinseong
 * @date 2024. 1. 5. - 오전 11:32:35
 * @subject	컴퓨터 - 사용자(USER)
 * @content	가위(1) 바위(2) 보(3) 게임
 * 			컴퓨터는 게임을 할때마다 임의의 수 (1~3) 발생
 * 			사용자는 1~3 입력.
 */
public class Ex03 {

	public static void main(String[] args) {

		int com, user;

		try(Scanner scanner = new Scanner(System.in)) {

			//			com = (int) (Math.random() * 3) + 1;
			//			System.out.println("> User 가위(1), 바위(2), 보(3) 선택");
			//			// 입력값에 대한 유효성 검사
			//			
			//			user = scanner.nextInt();
			//			
			//			System.out.printf("컴퓨터 : %d, 사용자 : %d\n", com, user);

			/*
			String strCom = null;

			com = (int) (Math.random() * 3) + 1;

			if (com == 1) strCom = "가위";
			else if (com == 2) strCom = "바위";
			else if (com == 3) strCom = "보";

			user = scanner.nextInt();

			System.out.printf("컴퓨터 : %s\n", strCom);
			 */

			/*
		      String [] rps = new String[4];
		      rps[0] = "";
		      rps[1] = "가위";
		      rps[2] = "바위";
		      rps[3] = "보";
			 */
			// 배열 초기화
			
			System.out.print("가위(1) 바위(2) 보(3) 입력 : ");
			com = (int) (Math.random() * 3) + 1;
			user = scanner.nextInt();
			String [] rps = { "", "가위", "바위", "보" };

			System.out.printf("%d(%s)\n", com, rps[com] );

			System.out.printf("컴퓨터 : %s, 사용자 : %s\n", rps[com], rps[user]);

			// 승자 / 패자
			switch (user - com) {
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



		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
