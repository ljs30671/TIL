package com.jslee;

public class MathSqrt_ {

	
	
	public static void main(String[] args) {
		long n=625;
		long result = 0;
		
		if(Math.pow(Math.sqrt(n), 2)== n) {
			result = (long) Math.pow(Math.sqrt(n)+1, 2);
		}
		else
			result = -1;
			
		System.out.println(result);

	}

}
