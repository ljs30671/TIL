package test1;

public class Test {

	public static void main(String[] args) {
		
		
		MyProfile m1 = new MyProfile();
		m1.setProfile("�씠以��꽠", 29, 176.6, 'f', false);
		m1.printProfile();
		
		MyProfile m2 = new MyProfile();
		m2.setProfile("源��꽑二�", 28, 160.2, 'f', true);
		m2.printProfile();

	}

}
