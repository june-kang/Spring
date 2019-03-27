package kr.co.fridgeideas.vo;

import org.springframework.stereotype.Component;

@Component
public class TermsVO {

	private String terms;
	private String privacy;
	
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	
	
}
