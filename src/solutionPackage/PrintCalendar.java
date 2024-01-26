package solutionPackage;

import java.util.Date;

public class PrintCalendar {

    public static final String FONT_YELLOW = "\u001B[33m";
	public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {

        int year = 2024;
        int month = 2;

        int lastDate = getLastDate(year, month);
        int dayOfWeek = getDayOfWeek(year, month, 1);
        // System.out.println(dayOfWeek);
        // System.out.println(lastDate);

        Date startDate = new Date(year-1900, month-1, 1); // 2024 02 01
        startDate.setDate(startDate.getDate() - dayOfWeek);

        for(int i = 0; i < 42; i++){
            if(startDate.getMonth() != month-1){
                System.out.printf("%02d\t", startDate.getDate());
            } else{
                System.out.printf("%02d\t", startDate.getDate());
            }
            startDate.setDate(startDate.getDate() + 1);
            if(i % 7 == 6)System.out.println();
        }

    }
    private static int getDayOfWeek(int year, int month, int date) {    // 입력한달의 1일이 무슨요일인지 구하는 함수
        Date d = new Date(year-1900, month-1, date);

        return d.getDay();
    }
    private static int getLastDate(int year, int month) {   // 29
        Date d = new Date(year-1900, month, 1); // 2024 03 01
        int date = d.getDate() - 1; // 2024.03.01 - 1
        d.setDate(date);

        return d.getDate();
    }
}
