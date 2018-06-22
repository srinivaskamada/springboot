package com.techsri.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/createTable",method=RequestMethod.GET)
	public void createTable(){
		try{
			jdbcTemplate.execute("create table CUSTOMERDATA ("+"id SERIAL, name VARCHAR2(255)"+")");
			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	@RequestMapping(value="/addData",method=RequestMethod.GET)
	public void addData(){
		
		try{
			jdbcTemplate.execute("insert into CUSTOMERDATA(id,name) values(1,'srinivas')" );
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/*@RequestMapping(value="/getData",method=RequestMethod.GET)
	public ArrayList getData(){
		
		try{
			List jdbcTemplate.execute("select * from CUSTOMERDATA" );
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}*/

}
