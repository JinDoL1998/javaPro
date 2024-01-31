package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Ex07 {

   public static void main(String[] args) {
      // A-Z , a-z , 0-9

      HashMap<Character, Integer> hm = new HashMap();
      //      for (int i = 'A'; i < 'Z'; i++) {
      //         hm.put((char)i , 0);
      //         hm.put((char)(i +32), 0);
      //      }
      //      for (int i = 0; i < 9; i++) {
      //         hm.put((char)i, i);
      //      }
      //      System.out.println(hm);

      for (int i = 0; i < 'z'; i++) {
         // i가 숫자이냐??
         if(Character.isDigit(i) || Character.isAlphabetic(i)) {
            hm.put((char)i, 0);
         }
      }

      String fileName = "\\src\\days18\\Ex01.java";

      String key1 = "user.dir";
      String userDir = System.getProperty(key1);

      String path = String.format("%s%s", userDir, fileName);

      try  (FileReader fr  = new FileReader(path)){
         int code;
         char one = '1';
         // read()는 파일의 끝에서 -1을 반환해준다.
         while( (code = fr.read()) != -1) {
            // 영문자만 뽑아오는 코드
            one = (char)code;
            if(   hm.containsKey(one)) {
               int count = hm.get(one);
               hm.put(one, count+1);   
            }
         } // while
      } catch (Exception e) {
         e.printStackTrace();
      } 

      Set<Entry<Character, Integer>> es =   hm.entrySet();
      Iterator<Entry<Character, Integer>> ir = es.iterator();
      while (ir.hasNext()) {
         Entry<Character, Integer> entry =  ir.next();
         char key = entry.getKey();
         int value = entry.getValue();
         System.out.printf("%s : %s%s\n", key, "#".repeat(value),  value);
      }
   }





}