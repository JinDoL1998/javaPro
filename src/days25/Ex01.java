package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

import days24.MemberVO;

public class Ex01 {

	 public static void main(String[] args) {
	      // Hashtable, HashMap, TreeMap, SortedMap
	      String fileName = ".\\src\\days24\\Java 팀 구성.txt";
	      TeamVO teamVo = new TeamVO();
	      HashMap<TeamVO, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();
	      
	      String line = null;
	      String teamName = null;
	      ArrayList<MemberVO> teamList = null;
	      
	      try(FileReader fr = new FileReader(fileName);
	         BufferedReader br = new BufferedReader(fr)   ) {
	         
	         while (   (line = br.readLine()) != null && !line.equals("") ) {
	        	String name = null;
	            teamName = line; // 1조,  2조  key
	            line = br.readLine(); // 구본혁(팀장),류영은,윤형준,김영진,강명건,김진성,유진,이동찬
	            String [] tNames = line.split("\\s*,\\s*");
	            teamList = new ArrayList<>();
	            String leader = null;
	            for (int i = 0; i < tNames.length; i++) {
	               name = tNames[i];
	               if ( name.contains("팀장") ) {  // 팀장
	                  leader = name = name.replace("(팀장)", "");
	                  teamList.add(new MemberVO( name, "팀장"));
	               } else {  // 팀원
	                  teamList.add(new MemberVO( name, "팀원"));
	               } // if
	            } // for
	            
	            int totalNumber = teamVo.getTotalNumber();
	            totalNumber = teamList.size();
	            
	            teamMap.put(new TeamVO(teamName, leader, totalNumber), teamList);
	            
	         } // while
	         
	         // 출력
	         dispTeamMember(teamMap);
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }

	   } // main

	   private static void dispTeamMember(HashMap<TeamVO, ArrayList<MemberVO>> teamMap) {
	      
	      Set<Entry<TeamVO, ArrayList<MemberVO>>> es = teamMap.entrySet();      
	      Iterator<Entry<TeamVO, ArrayList<MemberVO>>> ir = es.iterator();
	      
	      while (ir.hasNext()) {
	         Entry<TeamVO, ArrayList<MemberVO>> entry = ir.next();
	         TeamVO key = entry.getKey();  // "1조"   "2조"
	         ArrayList<MemberVO> value = entry.getValue();
	         int teamCount = value.size();
	         System.out.printf("[%s(%d명):%s]\n"
	               , key.getName(), key.getTotalNumber(), key.getLeader());
	         
	         Iterator<MemberVO> ir2 = value.iterator();
	         int sequence = 1;
	         ir2.next();	// 팀장 건너뛰기
	         while (ir2.hasNext()) {
				MemberVO memberVO = ir2.next();
				System.out.printf("  [%d] %s\n", sequence++, memberVO.getName());
			}
	         
	      } // while
	      
	      
//	      [1조(8명):구본혁]
//	        [1] 류영은
//	        [2] 윤형준
//	        [3] 김영진
//	        [4] 강명건
//	        [5] 김진성
//	        [6] 유진
//	        [7] 이동찬
//	      [2조(7명):원대안]
//	        [1] 이동영
//	        [2] 한재호
//	        [3] 권맑음
//	        [4] 박우현
//	        [5] 이시은
//	        [6] 조연화 
	      
	   } // dispTeamMember

	} // class
