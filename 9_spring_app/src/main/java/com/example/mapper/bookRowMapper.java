package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bookDto;

public class bookRowMapper implements RowMapper<bookDto> {
	
	@Override
	public bookDto mapRow(ResultSet rs, int rowNum) throws SQLException {

		bookDto dto = new bookDto();
		
		dto.setId(rs.getInt(1));
		dto.setBname(rs.getNString(2));
		dto.setBprices(rs.getDouble(3));
		
		
		return dto;
	}
	

}
