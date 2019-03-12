package kr.co.ch04;

import org.springframework.stereotype.Component;

@Component
public class LgSpeaker implements Speaker {
	
	@Override
	public void soundUp() {
		System.out.println("LG 소리를 올립니다.");
	}
	
	@Override
	public void soundDown() {
		System.out.println("LG 소리를 낮춥니다.");
	}
}
