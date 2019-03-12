package kr.co.ch04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	
	@Resource(name="lgSpeaker")
	private Speaker speaker;
	@Autowired
	private Internet internet;
	
	
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
