package my.fly;

public class Airplane extends Vehicle implements Flyer {
	
	
	public void flight() {
		int distance=transfer(1,10000);
		System.out.println(distance+" 거리만큼 엔진을 가동해서 난다...");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		flight();		
		
	}

}
