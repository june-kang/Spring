package kr.co.fridgeideas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping(value="/tips/usingtools")
	public String Tips() {
		return "/tips/usingtools";
	}

	@RequestMapping(value="/community/commu_list")
	public String commuList() {
		return "/community/commu_list";
	}
	
	@RequestMapping(value="/community/commu_write")
	public String commuWrite() {
		return "/community/commu_write";
	}
	
	@RequestMapping(value="/community/commu_view")
	public String commuView() {
		return "/community/commu_view";
	}
	
	@RequestMapping(value="/notice/notice")
	public String noticeList() {
		return "/notice/notice";
	}
}
