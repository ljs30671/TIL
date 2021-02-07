package com.jslee;

public class SumofTwoInteger {

	public static void main(String[] args) {
		int a1 = 0;
		int a2 = 100;
		int a3 = 1234;
		int a4 = -2323;
		int b1 = 45;
		int b2 = 99994;
		int b3 = -766;
		int b4 = -5;
		
		System.out.println(solution(a4,a2));

	}
	
	public static long solution(int a, int b) {
		
		if (a==b) {
			return (long) a;
		}else if (a>b) {
			return (long)((a-b+1)*(a+b)/2); 
		}else {
			return (long)((b-a+1)*(a+b)/2);
		}
		
	}

}
