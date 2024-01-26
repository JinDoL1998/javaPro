package solutionPackage;

import java.io.FileReader;
import java.util.Arrays;

public class AlphatbetGraph {
    public static void main(String[] args) {

        // C:\coding\JAVA\workSpace\javaPro\src\days18
        int[] counts = {1,2,3};
        int[][] countsAlphabetCase = new int[3][];
        countsAlphabetCase[0] = new int[26];
        countsAlphabetCase[1] = new int[26];
        countsAlphabetCase[2] = new int[10];

        String fileName = "\\javaPro\\src\\days18\\Ex01.java";
        String key = "user.dir";
        String userDir = System.getProperty(key);
        String path = userDir.concat(fileName);
        // System.out.println(path);

        try (FileReader fileReader = new FileReader(path)){
            int code;
            char one;

            while((code = fileReader.read()) != -1){
                one = (char) code;
                if(Character.isUpperCase(one)) countsAlphabetCase[0][one - 'A']++;
                else if(Character.isLowerCase(one)) countsAlphabetCase[1][one - 'a']++;
                else if(Character.isDigit(one)) countsAlphabetCase[2][one - '0']++;
            }

            for(int i = 0; i < 3; i++){
                String str = null;
                switch (i) {
                    case 0:
                        str = "대문자";
                        break;
                    case 1:
                        str = "소문자";
                        break;
                    case 2:
                        str = "숫자";
                        break;
                
                    default:
                        break;
                }
                System.out.printf("[%s 출력]\n", str);

                for(int j = 0; j < countsAlphabetCase[i].length; j++){
                    System.out.printf("%c : %s(%d)\n"
                                            , i == 0 ? 'A' + j : i == 1 ? 'a' + j : '0' + j
                                            , "#".repeat(countsAlphabetCase[i][j]), countsAlphabetCase[i][j]);
                }
                System.out.println();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
