package com.example;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.mapper.bookRowMapper;

public class BookDaoImp implements IbookDao {

	private JdbcTemplate template;
	
	
	public BookDaoImp(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public List<bookDto> getbook() {
		
		String sql = "select * from book";
		
		List<bookDto> book = template.query(sql, new bookRowMapper());
		
		return book;
		
		
	}

}
