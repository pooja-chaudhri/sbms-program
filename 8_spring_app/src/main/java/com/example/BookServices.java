package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class BookServices {
	
	IbookDao bookdao;
	
	public BookServices(IbookDao bookdao) {
		super();
		this.bookdao = bookdao;
	}
	
	 
	public void readdata() throws Exception {
		
		
		File file = new File("book.text");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		while(line != null) {
			
			String[] data = line.split(",");
			Integer id = Integer.parseInt(data[0]);
			String bname = data[1];
			Double bprices = Double.parseDouble(data[2]);
			
			bookdao.savebook(id, bname, bprices);
			
			 line = br.readLine();
			
		}
		System.out.println("data inserted  into database");
		
		br.close();
	}

}
