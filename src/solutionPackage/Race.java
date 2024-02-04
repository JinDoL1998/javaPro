package solutionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Race {

	public static void main(String[] args) throws IOException {

		// https://school.programmers.co.kr/learn/courses/30/lessons/178871
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		// [1]
		ArrayList<String> playerList = new ArrayList<>();


		while (true) {
			System.out.print("선수이름 입력 (종료하려면 'exit' 입력): ");
			String inputPlayer = br.readLine();

			if (inputPlayer.equalsIgnoreCase("exit")) break; 

			playerList.add(inputPlayer);
		}

		System.out.println(playerList);

		// System.out.println(playerList);
		String[] players = playerList.toArray(new String[0]);


		ArrayList<String> callList = new ArrayList<>();
		while(true) {
			System.out.print("선수입력 : (종료하려면 'exit' 입력)");
			String callPlayer = br.readLine();

			if(callPlayer.equalsIgnoreCase("exit")) break;

			callList.add(callPlayer);
		}

		System.out.println(callList);
		String[] callings = callList.toArray(new String[0]);


		String[] answer = solution(players, callings);

		System.out.println(Arrays.toString(answer));


	} // main


	public static String[] solution(String[] players, String[] callings) {
		String[] answer = {};
		
		
		/*
		// 각 선수의 호출 횟수를 저장
		ArrayList<String> playerList = new ArrayList<>(Arrays.asList(players));
		int callCount = playerList.size();
		
		for (String calling : callings) {
			int count = 0;
			for (String player : playerList) {
				if (calling.equals(player)) count++;
			}
			// 호출 횟수만큼 앞으로 이동
			for (int i = 0; i < callCount; i++) {
                if (playerList.get(i).equals(calling)) {
                    for (int j = 0; j < count; j++) {
                        if (i - j - 1 >= 0) {
                            String temp = playerList.get(i - j - 1);
                            playerList.set(i - j - 1, playerList.get(i - j));
                            playerList.set(i - j, temp);
                        }
                    }
                }
            }
        }

		answer = playerList.toArray(new String[0]);
		*/
        Set<String> playerSet = new HashSet<>(Arrays.asList(players));
        ArrayList<String> playerList = new ArrayList<>(Arrays.asList(players));

        for (String calling : callings) {
            int count = Collections.frequency(playerList, calling);

            for (int i = 0; i < playerList.size(); i++) {
                if (playerList.get(i).equals(calling)) {
                    for (int j = 0; j < count; j++) {
                        if (i - j - 1 >= 0) {
                            Collections.swap(playerList, i - j, i - j - 1);
                        }
                    }
                }
            }
        }

        answer = playerList.toArray(new String[0]);
		return answer;
	}

}// class
