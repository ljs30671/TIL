package test.exception2;

public class Calculator {
	
	public int divide(int x, int y) throws MyException {
		
		int z=0;
		if(y==0) {
			throw new MyException("y를 0으로 입력하지 마세요");
			
		}
			z=x/y;
		
		return z;
		
	}

}
