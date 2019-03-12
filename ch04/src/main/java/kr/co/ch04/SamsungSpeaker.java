package kr.co.ch04;

import org.springframework.stereotype.Component;

@Component
public class SamsungSpeaker implements Speaker {
	
	@Override
	public void soundUp() {
		System.out.println("ªÔº∫ º“∏Æ∏¶ ø√∏≥¥œ¥Ÿ.");
	}
	
	@Override
	public void soundDown() {
		System.out.println("ªÔº∫ º“∏Æ∏¶ ≥∑√‰¥œ¥Ÿ.");
	}
}
