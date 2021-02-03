package test.multi.array;

public class Test {

	public static void main(String[] args) {
		
		int all[][]= new int [3][];
		System.out.println(all);
		System.out.println(all[0]);
		System.out.println(all[1]);
		System.out.println(all[2]);
		all[0]=new int[4];
		all[1]=new int[3];
		all[2]=new int[3];
		all[0][0]=100;
		System.out.println(all[0][0]);
		System.out.println(all[0][1]);
		System.out.println(all[1][0]);
		System.out.println(all[1][1]);
		System.out.println(all[2][0]);
		all[2][1]=29;
		System.out.println(all[2][1]);
		System.out.println(all[0].length);
		
		
		char [][]all2= {{'a','b'},{'c','d','e'}};

	}

}
