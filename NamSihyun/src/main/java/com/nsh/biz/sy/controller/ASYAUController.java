package com.nsh.biz.sy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsh.biz.sy.dto.ASYAU10001DTO;
import com.nsh.biz.sy.service.ASYAUService;

@RestController
@RequestMapping("/biz/sy/au")
public class ASYAUController {
	
	@Autowired
	private ASYAUService asyauService;
	
	@GetMapping("/ASYAU10000.view")
	public String ASYAU10000() throws Exception{
		return "ASYAU10000";
	}
	
	@GetMapping("/ASYAU10001.json")
	public List<ASYAU10001DTO> ASYAU10001(ASYAU10001DTO dto) throws Exception {
		return asyauService.ASYAU10001(dto);
	}

}
