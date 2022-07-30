package AssignmentCode;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number=172;
		int sum=0;int remainder;int temp;
		temp=number;
		while(number>0) {
			remainder=number%10;
			sum=sum+(remainder*remainder*remainder);
			number=number/10;
		}
		if(temp==sum) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("not Amstrong number");
		}
		// TODO Auto-generated method stub

	}

}
