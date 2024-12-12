package com.example;

import java.util.List;

public class BookServices {

	
	private BookDaoImp bookdaoimp;
	private ExcelGenerator excelgenerator;
	
	public BookServices(BookDaoImp bookdaoimp, ExcelGenerator excelgenerator) {
		super();
		this.bookdaoimp = bookdaoimp;
		this.excelgenerator = excelgenerator;
	}
	
	public void generate () throws Exception {
		
		List<bookDto> booki = bookdaoimp.getbook();
		
		excelgenerator.ExcelGenerator(booki);
		
		booki.forEach(sheet ->{
			System.out.println(sheet);
		});
		 
		System.out.println("data add into excel");
		}
	
	
}
