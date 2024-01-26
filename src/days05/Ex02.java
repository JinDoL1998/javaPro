package days05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int kor;

		try (Scanner sc = new Scanner(System.in);){
            System.out.print("점수를 입력하세요 >");
            kor = sc.nextInt();
            
            int result = (  kor>=0 && kor <= 100 ) ? 1 : 0;
            
            switch (  result ) {
            case 1:
               
               switch ( kor / 10 ) {
               case 10:   
                  System.out.println("수");
                  break;
               case 9:
                  System.out.println("수");
                  break;
               case 8:
                  System.out.println("우");
                  break;
               case 7:
                  System.out.println("미");
                  break;
               case 6:
                  System.out.println("양");
                  break;
               default:
                  System.out.println("가");
                  break;

               }
               
               break;

            case 0:
               System.out.println("0~100 입력잘못!!");
               break;
            }
            

        } catch (Exception e) {
        	
		}
			
			
	}
}
