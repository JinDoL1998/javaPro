package solutionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
        
//        for(int i = 0; i < callList.size(); i++) {
//        	callList.get(i)
//        }
        
        
        // System.out.println(callList);
        String[] callings = callList.toArray(new String[0]);
        
		
        String[] answer = solution(players, callings);
        
        System.out.println(Arrays.toString(answer));
        
        
        
		
        
		
        
		/* [2]
		String[] players = new String[50];
		String[] callings = new String[100000];
		
		int index = 0;
		
		while (index < players.length) {
			System.out.print("선수이름 입력 (종료하려면 'exit' 입력): ");
			players[index] = scanner.next();
			
			if(players[index].equalsIgnoreCase("exit")) {
				break;
			}
			
			if(players[index]== null) return;
			
			index++;
		}
		
//		ArrayList<String> playerList = new ArrayList<>(Arrays.asList(players));
//		
//		playerList.removeIf(value -> value == null);
//		System.out.println(playerList);
		
		System.out.println(Arrays.toString(players));
		*/

	} // main
			
	
	public static String[] solution(String[] players, String[] callings) {
		String[] answer = {};
				
		for(int i = 0; i < callings.length; i++) {
			for(int j = 0; j < players.length; j++) {
				if(callings[i].equals(players[j])) {
					String temp = players[j];
					players[j] = players[j-1];
					players[j-1] = temp;
				}
			}
		}

		return answer = players;
	}

}// class
