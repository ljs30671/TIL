package test.method;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		
		int result1=myCalc.plus(5, 5);
		System.out.println(result1);
		
		byte x=10;
		byte y=5;
		double result2=myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();

	}

}