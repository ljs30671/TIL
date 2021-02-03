package test.datatype;

import java.util.Date;

public class Test {	
	
	public static void main(String[] args) {
		
		int age=29;
		double tall=176.6;
		char gender='남';
		boolean isPretty=true;
		
		//MemberName name= new MemberName();
		String name=new String("이준섭");
		
		//MyDate birthday=new MyDate();
		Date birthday=new Date(1993,05,02);
		
		
		System.out.println(age);
		System.out.println(tall);
		System.out.println(gender);
		System.out.println(isPretty);
		System.out.println(name);
		System.out.println(birthday.getYear()+"년"+birthday.getMonth()+"월"+birthday.getDay()+"일");
		
		
		
		
	}

}
