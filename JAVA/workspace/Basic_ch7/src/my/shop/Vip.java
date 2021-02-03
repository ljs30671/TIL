package my.shop;

public class Vip extends Customer {
	
	@Override //annotation : 의미 있는 주석 (override가 맞는지 심사를 해주세요~)
	public void calcPoint() {
		
		System.out.println("100포인트 추가 되었습니다.");
	}

}
