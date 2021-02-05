package test.Interface_;

public interface RemoteControl {
	//상수
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("mute");
		} else {
			System.out.println("unmute");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("Change Battery.");
	}
}
