package kr.co.ch03;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private Internet internet;
	
	public SamsungTV(Speaker speaker, Internet internet) {
		this.speaker = speaker;
		this.internet = internet;
	}
	
	
	@Override
	public void power() {
		System.out.println("»ï¼º Àü¿ø ÄÔ!");		
	}

	@Override
	public void chUp() {
		System.out.println("»ï¼º Ã¤³Î À§·Î!");
	}

	@Override
	public void chDown() {
		System.out.println("»ï¼º Ã¤³Î ¾Æ·¡·Î!");
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
