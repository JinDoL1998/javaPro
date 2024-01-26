package days18;

import java.util.Arrays;

public class Ex04_01 {
	public static void main(String[] args) {
		
		// String todo = "TODO Auto-generated method stub";
		// System.out.println(todo.codePointAt(0));
		
		// boolean todo.equals("");
		// int todo.compareTo("");		0 양수 음수
		// int todo.compareToIgnoreCase(""); 대소문자 구분 x 0 양수 음수
		
		/*
		System.out.println("ABC".compareToIgnoreCase("Abd")); // 0 
		System.out.println("ABC".compareTo("AcC")); // -33
		System.out.println("CBC".compareTo("AcC")); // 2 
		*/
		
		// todo.endsWith(suffix);		// 접미사
		// todo.startsWith(prefix);		// 접두사
		
		String url = "https://www.naver.com";
		// System.out.println(url.startsWith("https://"));
		// System.out.println(url.endsWith(".com"));
		
		// [문제]
		/*
		String directory = "C:\\spring\\src";
		String fileName = "Sample.java";
		
		if(!directory.endsWith("\\")) {
			directory += "\\";
		}
		*/
		
		// char 마지막한문자 = directory.charAt(directory.length()-1);
		// if (마지막 한문자  = '\')
		
		/*
		String path = directory + (directory.endsWith("\\") ? "" : "\\") + fileName;
		System.out.println(path);
		*/
		
		// boolean todo.equals(todo);
		// boolean todo.equalsIgnoreCase(todo);
		/*
		byte[] todoByteArray = todo.getBytes();
		System.out.println(Arrays.toString(todoByteArray));
		*/
		
		// todo.indexOf(0);		// 앞에서부터 찾아서 찾은 인덱스 값을 반환
		// todo.lastIndexOf(0);	// 뒤에서부터 찾아서 찾은 인덱스 값을 반환
		// System.out.println(todo.indexOf("Auto"));
		// System.out.println(todo.lastIndexOf("Auto"));
		
		// todo.matches(regex);
		
		// System.out.println("-".repeat(30));
		
		String todo = "TODO Auto-generated all method Alert stub";
		/*
		System.out.println(todo.replace('e', '*'));
		System.out.println(todo.replaceAll("[Aa]\\.*", "*"));
		System.out.println(todo.replaceFirst("[Aa]\\.*", "*"));
		*/
		
		/*
		String regex = " ";
		// String[] todoArr = todo.split(regex);	
		String[] todoArr = todo.split(regex,3);	// limit
		System.out.println(Arrays.toString(todoArr));
		*/
		
		// todo.strip();			// trim() 앞 뒤 공백 제거
		// todo.stripLeading(); 	// leading 이끄는 앞 공백제거
		// todo.stripTrailing();	// trailing 뒤 공백 제거
		
		/*
		System.out.println("["+     "         홍길동      ".trim() +"]");
		System.out.println("["+     "         홍길동      ".strip() +"]");
		System.out.println("["+     "         홍길동      ".stripLeading() +"]");
		System.out.println("["+     "         홍길동      ".stripTrailing() +"]");
		*/
		
		// todo.substring(0);
		// todo.substring(0,2);
		
		// todo.subSequence(beginIndex, endIndex);
		// 1) 기능
		// 2) substring() 차이점?
		/*
		System.out.println(todo.substring(2, 7));	// DO Au	리턴타입 : String
		System.out.println(todo.subSequence(2, 7)); // Do Au			 : CharSequence
		*/
		
		// String -> byte[] getBytes() 
		// String -> char[] toCharArray()
		// char[] todoCharArray = todo.toCharArray();
		
		// todo.toString();
		
		// System.out.println(todo.toLowerCase());
		// System.out.println(todo.toUpperCase());
		
		// String.format("")
		
		// System.out.println("<ul><li>" + String.join("</li><li>", "김진성", "권맑음", "구본혁", "한재호" + "</li></ul>"));
		
		// 3.14 + ""
		// true + ""
		// 100 + ""
		/*
		char[] m = {'a', '2', 'x'};
		String s = String.valueOf(m);
		System.out.println(s);	// "a2x";
		*/
		
		// char[] -> String
		char[] m = {'a', '2', 'x'};
		String s = new String(m);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main
}
