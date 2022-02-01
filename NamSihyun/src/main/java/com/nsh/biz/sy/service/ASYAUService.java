package com.nsh.biz.sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsh.biz.sy.dto.ASYAU10001DTO;
import com.nsh.dao.sy.ASYAUMapper;

@Service
public class ASYAUService {
	
	@Autowired
	private ASYAUMapper asyauMapper;
	
	public List<ASYAU10001DTO> ASYAU10001(ASYAU10001DTO dto) throws Exception{
		return asyauMapper.getUser(dto);
	}

}
