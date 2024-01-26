package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day10Prac {

	public static int [] intArr = {3,5,2,4,1}; 

	public static void main(String[] args) throws IOException {

		
		appendArray();
		intArr[5] = intArr[4];
		intArr[4] = intArr[3];
		intArr[3] = 4;
		
		dispArray(intArr);
		
	} // main

	private static void dispArray(int[] intArr) {

		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
		}

	}

	private static void appendArray() {	

		int [] temp = new int[intArr.length + 3];

		for (int i = 0; i < intArr.length; i++) {
			temp[i]= intArr[i];
		}
		intArr = temp;      
	}

}
