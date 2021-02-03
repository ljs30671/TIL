package test.array;

public class MemberTest {

	public static void main(String[] args) {
		MemberDB db=new MemberDB();
//		db.setMemberName("이준섭");
//		db.setMemberName("전은수");
//		db.setMemberName("홍길동");
//		
//		db.printNames();
//		
//		System.out.println(args);
//		System.out.println(args.length);
		
		for(int i=0;i<args.length;i++) {
			db.setMemberName(args[i]);
		}
		
		db.printNames();

	}

}
