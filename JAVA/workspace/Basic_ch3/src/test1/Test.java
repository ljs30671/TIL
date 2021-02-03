package test1;

public class Test {

	public static void main(String[] args) {
		
		
		MyProfile m1 = new MyProfile();
		m1.setProfile("이준섭", 29, 176.6, '남', false);
		m1.printProfile();
		
		MyProfile m2 = new MyProfile();
		m2.setProfile("김선주", 28, 160.2, '여', true);
		m2.printProfile();

	}

}
