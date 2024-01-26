package days15;

public class Test {

	public static void main(String[] args) {

		String n = "keNik";   
		String m = "kKnie";

		char[] nArr = new char[100];
		char[] mArr = new char[100];

		int nCount = 0, mCount = 0;

		while(true) {
			nArr[nCount] = n.charAt(nCount);
			if(nArr[nCount] == '0') break;
			nCount++;
		}

		while(true) {
			nArr[mCount] = m.charAt(mCount);
			if(mArr[mCount] == '0') break;
			mCount++;
		}

		boolean b;

		if(nCount == mCount) b = true;
		else b = false;

	}

}
