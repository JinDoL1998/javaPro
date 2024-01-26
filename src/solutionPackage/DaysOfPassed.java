package solutionPackage;

import java.util.Date;

public class DaysOfPassed {

	public static void main(String[] args) {
		// 4. 개강일(2023.12.29. 9:00:00)로 부터 오늘까지 지난 일수 계산을 하세요.. 
		
		/* [1]
		System.out.println(days10.Ex02.getTotalDates(2023, 12, 29));
		System.out.println(days10.Ex02.getTotalDates(2024, 1, 26));
		
		System.out.println(days10.Ex02.getTotalDates(2024, 1, 26) - days10.Ex02.getTotalDates(2023, 12, 29));
		*/
		
		
		Date startDate = new Date(2023-1900, 12-1, 29, 9, 0, 0);
		System.out.println(startDate.getTime());
		
		Date nowDate = new Date();
		System.out.println(nowDate.getTime());
		
		// 지나간 밀리세컨드
		long passOfDate = nowDate.getTime() - startDate.getTime();
		
		/* [2]
		System.out.println(passOfDate + "ms");
		System.out.println(passOfDate/1000 + "s");
		System.out.println(passOfDate/(1000*60) + "m");
		System.out.println(passOfDate/(1000*60*60) + "h");
		System.out.println(passOfDate/(1000*60*60*24) + "d");
		*/
		
		d_day();
		
		
	}
	
	// [시험1] 
	   // 수료일(D-Day) 까지 남은 시간 출력 메서드 
	   private static void d_day() {
	      Date endDay = new Date(2024-1900, 6-1, 14, 18,0,0); 
	      Date today = new Date();
	      long diff =  endDay.getTime() - today.getTime(); 
	      long 몫 = diff / (1000*60*60*24);
	      System.out.print( 몫 +"d ");
	      diff %= (1000*60*60*24); 
	      
	      몫 = diff /  (1000*60*60);
	      System.out.print( 몫 +"h:");
	      diff %= (1000*60*60); 
	      
	      몫 = diff /  (1000*60);
	      System.out.print( 몫 +"m:");
	      diff %= (1000*60); 
	      
	      몫 = diff /  (1000);
	      System.out.print( 몫 +"s.");
	      diff %= (1000); 
	      
	      System.out.println( diff +"ms");
	      
	      try {
	         System.out.println("\n\n\n\n");
	         Thread.sleep(10);
	         d_day();
	         
	      } catch (InterruptedException e) { 
	         e.printStackTrace();
	      }
	   }

}
