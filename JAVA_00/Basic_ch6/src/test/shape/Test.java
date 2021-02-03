package test.shape;

public class Test {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		
		c.setRadius(-5);
		t.setH(-5);
		t.setW(-2);
		r.setH(-1);
		r.setW(-3);
		
		Printer out=new Printer();
		
		out.print(c);
		out.print(r);
		out.print(t);
		//out.print("java"); //1
		
	}
	
}
