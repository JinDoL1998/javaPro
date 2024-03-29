package solutionPackage;

import java.util.Date;

public class CompareDate {

	public static void main(String[] args) {
		/*
		설문조사 기간이 
		시작일  2024.1.20  00:00:00
		종료일  2024.1.26  00:00:00
		일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.
		 */

		Date today = new Date(); 
		// 2024. 1. 26. 오전 10:31:20
		System.out.println(today.toLocaleString());


		/*
	      //    오늘날짜 >= 시작일  &&  오늘날짜 <= 종료일    설문가능
	    Date startDay = new Date(2024-1900, 1-1, 20);
		startDay.getTime() 1233131312
	    Date endDay  = new Date(2024-1900, 1-1, 26, 0, 0, 0);
	    endDay.getTime() 1233131312
	    Date today = new Date();
	    today.getTime()  23424234

		//오늘날짜 > 시작일  &&  오늘날짜 < 종료일    설문가능
  		if(today.getTime() >= startDay.getTime() && today.getTime() <= endDay.getTime())
	    if (today.after(startDay)&&today.before(endDay) ) {
	    	System.out.println("오늘은 설문이 가능한 날입니다.");
	    } else {
	        System.out.println("오늘은 설문이 불가능한 날입니다.");
	    }
		*/

		Date a  = new Date(2024-1900, 1-1, 27, 0, 0, 0);
		Date b  = new Date(2024-1900, 1-1, 29, 0, 0, 0);

		System.out.println( a.after(b) );  // >
		System.out.println( a.before(b) ); // <
		System.out.println( a.equals(b) ); // 

		// "AbC"   "abC"  -32
		// "abC"   "abC"  0
		// "abC"   "AbC"  32
		System.out.println( a.compareTo(b) ); // 

	}

}
