package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Ex09 {

	public static void main(String[] args) {
		
		// 날짜-날짜 = Period
		// 시간-시간 = Duration
		// 문제) 수료일 - 오늘날짜 = 날짜간격
		/*
		LocalDate endDate = LocalDate.of(2024, 6, 14);
		LocalDate today = LocalDate.now();
		
		// 4개월 16일
		Period p =  Period.between(today, endDate);
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		*/
		
		// 시간차 : Duration
		LocalTime endTime = LocalTime.of(18, 0);
		System.out.println(endTime);
		LocalTime t = LocalTime.now();
		Duration d = Duration.between(t,endTime);
		System.out.println(d.getSeconds());
		System.out.println(d.getSeconds()/60);
		System.out.println(d.getSeconds()/60/60);
		
	}

}
