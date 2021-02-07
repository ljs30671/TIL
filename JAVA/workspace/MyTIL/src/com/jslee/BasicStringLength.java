/*문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.*/
package com.jslee;

public class BasicStringLength {

	public static void main(String[] args) {

		String s1 = "1234";
		String s2 = "a234";
		String s3 = "123456";
		String s4 = "a23456";
		String s5 = "";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
		System.out.println(solution(s5));

	}

	public static boolean solution(String s) {
		char ck;
		if (s.length() == 4 || s.length() == 6) {

			for (int i = 0; i < s.length(); i++) {
				ck = s.charAt(i);

				if (ck < 48 || ck > 58) {
					return false;
				}
			}
			return true;

		}
		return false;
	}

}
