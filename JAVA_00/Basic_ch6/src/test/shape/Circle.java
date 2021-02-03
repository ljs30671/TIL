package test.shape;

public class Circle extends Shape {
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if(radius>0) {
			this.radius = radius;
		}else {
			System.out.println("Error : 원의 반지름은 반드시 0보다 크거나 같아야 합니다.");
		}
	}

	public void area() {//재정의
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}
}
