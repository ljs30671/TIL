package test.shape;

public class Triangle extends Shape {
	private int w,h;
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		if(w>0) {
			this.w = w;
		}else {
			System.out.println("Error : 삼각형의 밑변은 반드시 0보다 크거나 같아야 합니다.");
		}
	}
	
	public int getH() {
		return h;
	}

	public void setH(int h) {
		if(h>0) {
			this.h = h;
		}else {
			System.out.println("Error : 삼각형의 높이는 반드시 0보다 크거나 같아야 합니다.");
		}
	}
	
	public void area() {
		System.out.println("삼각형의 넓이="+(w*h/2));
	}

}
