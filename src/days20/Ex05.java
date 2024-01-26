package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author jinseong
 * @date 2024. 1. 26. - 오후 3:23:32
 * @subject	DecimalFormat 형식화 클래스
 * @content	숫자 -> 문자열 format() 변환
 * 			문자열 -> 숫자 format() 변환
 * 
 * 			SimpleDateFormat 형식화 클래스
 * 			날짜 	-> 문자열 format() 변환
 * 			문자열	-> 날짜 parse() 변환
 */
public class Ex05 {

	public static void main(String[] args) {
		
		/* format
		Calendar c = Calendar.getInstance();
		// 24년 1월 26일 (금요일)
		
		String pattern = "yy년 M월 d일 (E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = c.getTime();
		String strDF = sdf.format(d);
		System.out.println(strDF);
		*/
		
		// [2]
        String strDate = "24년 1월 26일 (금요일)";
		//String strDate = "24년 1월 26일";
        String pattern = "yy년 M월 dd일 (E)";
        // String pattern = "yy년 M월 d일";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        // 1) Date d
        try {
            // String -> Date 변환(파싱)
            Date d = sdf.parse(strDate);
            System.out.println(d.toLocaleString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
		// 2) Calendar c
		
		
		
		
	}

}
