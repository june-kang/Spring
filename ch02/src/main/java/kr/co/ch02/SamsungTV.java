package kr.co.ch02;

public class SamsungTV implements TV {
	
	@Override
	public void power() {
		System.out.println("»ï¼º TV Àü¿ø ÄÔ");
	}
	
	@Override
	public void chUp() {
		System.out.println("»ï¼º TV Ã¤³Î À§·Î..");
	}
	
	@Override
	public void chDown() {
		System.out.println("»ï¼º TV Ã¤³Î ¾Æ·¡·Î..");
	}
}