package solutionPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> scoreList = new ArrayList<>();

        // 사용자로부터 원하는 만큼 입력을 받음
        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 'exit' 입력): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // exit를 입력하면 입력 종료
            }

            // ArrayList에 입력받은 값을 추가
            scoreList.add(input);
        }

        // 입력 받은 점수 출력
        System.out.println("입력한 점수: " + scoreList);

        // 필요하다면 ArrayList를 배열로 변환할 수 있음
        String[] scoreArray = scoreList.toArray(new String[0]);

        // 이후에 scoreArray를 사용할 수 있음
        System.out.println("배열로 변환한 점수: " + String.join(", ", scoreArray));

        scanner.close();
        
    }
}
