package test.constructor;

public class KoreanExample {
	
	public static void main(String[] args) {
		Korean k1=new Korean("박자바","201114-1234567");

		System.out.println("k1.name:"+k1.name);
		System.out.println("k1.ssn:"+k1.ssn);

		Korean k2=new Korean("김자바","910525-1233333");
		
		System.out.println("k1.name:"+k2.name);
		System.out.println("k1.ssn:"+k2.ssn);
		
		Korean k3=new Korean();
		System.out.println(k3.name);
		System.out.println(k3.ssn);
	}
	
}
