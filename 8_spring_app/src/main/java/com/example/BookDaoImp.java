package com.example;

import org.springframework.jdbc.core.JdbcTemplate;


public class BookDaoImp implements IbookDao{
	
	
	private JdbcTemplate template;
	
	
	public BookDaoImp(JdbcTemplate templete) {
		this.template = templete;
	}
	
	
	@Override
	public void savebook(int id, String bname, double bprices) {

		String sql = "insert into book values(?,?,?)";

		template.update(sql, ps -> {
			ps.setInt(1, id);
			ps.setString(2, bname);
			ps.setDouble(3, bprices);
		});
	}

}

