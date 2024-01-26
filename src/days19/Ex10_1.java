package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10_1 {

	public static void main(String[] args) {
		
		String source = "HandPhone: 010-1234-1234, HOME: 02-678-9999";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern p = Pattern.compile(pattern);
		p.matcher(source);
		Matcher m = p.matcher(source);
		
		// boolean m.matches();
		// boolean m.find();
		int no = 0;
		while(m.find()) {
			System.out.printf("%d: %s\t %s-%s \n", ++no, m.group(), m.group(1), m.group(2));
		}
		
	} // main

}// class
