package my.fly;

public class Car extends Vehicle {
	
	public void drive(String from, String to) {
		
		int distance=transfer(30, 175);
		System.out.println(distance+"만큼 달립니다...");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

}
