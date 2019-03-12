package kr.co.ch04;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {
	
	@Resource(name="samsungSpeaker")
	private Speaker speaker;
	@Inject
	private Internet internet;
	
	
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
