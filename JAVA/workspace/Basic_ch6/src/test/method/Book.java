package test.method;

public class Book {
	int i;
	public void want(String ...all) {
		System.out.println(all);
		for(String s:all) { //향상된 for문
			System.out.println(s);
		}
	}

	public void test() {
		System.out.println(this);
		
	}
	public void test(int i) {
		this.i=i;
		System.out.println(this.i);
	}
}

