package solutionPackage;

import java.util.Arrays;
import java.util.HashMap;

public class Race_1 {

	public static void main(String[] args) {

		String[] players = { "mumu", "soe", "poe", "kai", "mine"};
		String[] callings =    {"kai", "kai", "mine", "mine"};
		players = solution(players, callings);
		System.out.println(Arrays.toString(players));



	} // main

	public static String[] solution(String[] players, String[] callings) {
		HashMap<String, Integer> playersMap = new HashMap<>();
		for (int i = 0; i <players.length; i++) {
			playersMap.put(players[i], i);
		}
		for (int i = 0; i < callings.length; i++) {
			// 현재 불려진 선수
			String player = callings[i];
			// 현재 선수의 등수값
			int nowRank = playersMap.get(callings[i]);
			// 현재 선수의 앞에 선수값
			String frontPlayer = players[nowRank-1];

			// players[]에서 현재선수의 -1 자리에 calling된 선수 넣고
			players[nowRank-1] = player;
			// players[]에서 현재선수의 자리에 앞에 있는 선수를 넣으면 교체된다.
			players[nowRank] = frontPlayer;

			// Map에도 위의 배열에 집어넣는 방법을 통해 교체할 수 있다.
			playersMap.put(frontPlayer, nowRank);
			playersMap.put(player, nowRank-1);

		}
		return players;
	}

} // class
