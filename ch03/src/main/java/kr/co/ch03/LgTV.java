package kr.co.ch03;

public class LgTV implements TV {
	
	private Speaker speaker;
	private Internet internet;
	
	
	// setter를 통한 객체 주입
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	
	@Override
	public void power() {
		System.out.println("LG 전원 켬!");		
	}

	@Override
	public void chUp() {
		System.out.println("LG 채널 위로!");
	}

	@Override
	public void chDown() {
		System.out.println("LG 채널 아래로!");
	}
	
	public void soundUp() {
		speaker.soundUp();
	}
	
	public void soundDown() {
		speaker.soundDown();
	}

	@Override
	public void connect() {
		internet.connect();
	}

	@Override
	public void disconnect() {
		internet.disconnect();
	}
}
