package com.jslee;

public class Avg {

	public static void main(String[] args) {
		
		int[] a1= {1,2,3,4};
		int[] a2= {1,4644,-448};
		int[] a3= {1,7894,-4445,6666};
		
		System.out.println(sol(a1));
		System.out.println(sol(a2));
		System.out.println(sol(a3));
		
	}
	
	public static double sol(int[] arr) {
		double sum =0;
		
		for (int i=0;i<arr.length;i++) {
			sum += (double)arr[i];
		}
		return sum/arr.length;
		
	}

}
