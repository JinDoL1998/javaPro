package days20;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex07_02 {

	public static void main(String[] args) throws ParseException {

		String output = "이름:김진성, 나이:25살, 성별:남자, 키:177.12, 등급:A 입니다.";

		String pattern = "이름:{0}, 나이:{1}, 성별:{2}, 키:{3}, 등급:{4} 입니다.";
		MessageFormat mf = new MessageFormat(pattern);

		Object[] objs = mf.parse(output);
		for(Object o : objs) {
			System.out.println(o);
		}
		
	} 

}
