package my.fly;

public abstract class Vehicle {
	
	public int transfer (int start, int end) {
		
		int distance= end - start;
		
		return distance;
		
	}
	
	public abstract void drive();

}
