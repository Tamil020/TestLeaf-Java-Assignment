package AssignmentCode;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="act";
		String text2="tca";
		if(text1.length()==text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println(charArray1);
			System.out.println(charArray2);
			System.out.println("Do both arrays match:"+Arrays.equals(charArray1, charArray2));
		}
		// TODO Auto-generated method stub

	}

}
