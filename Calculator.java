package week2.day1;

public class Calculator {
	public int subtract(int a,int b) {
		return a-b;	
	}
public int add(int e,int f) {
	return e+f;
}
public double multiply(double i,double j) {
	return i*j;
}
public float divide(float x,float y) {
	return x/y;
}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int subtract=calc.subtract(100,70);
		System.out.println(subtract);
		int add=calc.add(100,90);
		System.out.println(add);
		double multiply=calc.multiply(10, 12);
		System.out.println(multiply);
		float divide=calc.divide(100f, 10f);
		System.out.println(divide+"f");// TODO Auto-generated method stub

	}

}
