package pj1.shop;

public class Shop {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		//c1.name = "이준섭";
		c1.address = "평택";
		c1.gender = '남';
		
		System.out.println(c1);
		System.out.println(c1.name);
		System.out.println("["+c1.gender+"]");
		System.out.println(c1.address);
		System.out.println(c1.age);
		System.out.println(c1.tall);
		System.out.println(c1.isPretty);
		
		Customer c2=new Customer();
		//c2.name = "김선주";
		c2.address = "병점";
		c2.gender = '여';
		
		System.out.println(c2);
		System.out.println(c2.name);
		System.out.println("["+c2.gender+"]");
		System.out.println(c2.address);
		System.out.println(c2.age);
		System.out.println(c2.tall);
		System.out.println(c2.isPretty);

		
	}

}
