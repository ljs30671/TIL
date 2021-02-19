package pj1.shop;

public class Shop {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		//c1.name = "�씠以��꽠";
		c1.address = "�룊�깮";
		c1.gender = 'f';
		
		System.out.println(c1);
		System.out.println(c1.name);
		System.out.println("["+c1.gender+"]");
		System.out.println(c1.address);
		System.out.println(c1.age);
		System.out.println(c1.tall);
		System.out.println(c1.isPretty);
		
		Customer c2=new Customer();
		//c2.name = "源��꽑二�";
		c2.address = "蹂묒젏";
		c2.gender = 'm';
		
		System.out.println(c2);
		System.out.println(c2.name);
		System.out.println("["+c2.gender+"]");
		System.out.println(c2.address);
		System.out.println(c2.age);
		System.out.println(c2.tall);
		System.out.println(c2.isPretty);

		
	}

}
