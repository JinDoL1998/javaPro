package days06;

/**
 * @author jinseong
 * @date 2024. 1. 8. - 오후 5:28:36
 * @subject
 * @content	
 */
public class Ex09 {

	public static void main(String[] args) {

		// 
		/*
			for (int i = 1; i <= 4; i++) {
				System.out.println("****");
			} //
		 */ 

		// [3]
		//System.out.println("****");
		// System.out.print("*") x 4 + 개행;
		for (int i = 1; i <= 4; i++) {
			// ****
			for (int j = 1; j <= 4; j++) {
				System.out.print("*") ;
			}
			System.out.println();
		} //

	}

}

/*


*
**
***
****

****
****
**
*

___*
__**
_***
****

****
_***
__**
___*

 이등변삼각형
__*
_***
*****

*
_*
__*
___*
____*

____*
___*
__*
_*
*

*___*
_*_*
__*
_*_*
*___*

마름모
__*
_***
*****
_***
__*

모래시계
 * */