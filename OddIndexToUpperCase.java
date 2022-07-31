package AssignmentCode;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		//converting odd index of a given string to uppercase
		 String test="tamilvanan";

			char[] charArray = test.toCharArray();

			String convertedStr="";

			for(int i=0;i<charArray.length;i++) {
				if(i%2!=0) {
					convertedStr=convertedStr+Character.toUpperCase(charArray[i]);
				}
				else {
					convertedStr=convertedStr+charArray[i];

				}
			}



			System.out.println(convertedStr);
		}
// TODO Auto-generated method stub

	}


