package com.nsh.dao.sy;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.nsh.biz.sy.dto.ASYAU10001DTO;

@Repository
@Mapper
public interface ASYAUMapper {
	List<ASYAU10001DTO> getUser(ASYAU10001DTO dto) throws SQLException;
}
