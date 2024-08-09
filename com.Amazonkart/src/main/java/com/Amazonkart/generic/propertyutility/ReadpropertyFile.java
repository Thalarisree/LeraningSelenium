package com.Amazonkart.generic.propertyutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Amazonkart.generic.common.Frameworkconstant;

public class ReadpropertyFile implements Frameworkconstant{
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;
	public String readdata(String key) {
		//convert the physical file into java understandable
		try {
			fis =new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//creating instance for property class
		p=new Properties();
		
		//load the all common data
		try {
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//fetch the data
		String data=p.getProperty(key);
		
		return data;
	}
	public void writedata(String key,String value) 
	{
		//enter the data
		p.put(key, value);
		
		//create instance for file output stream
		try {
			fos=new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//store the data
		try {
			p.store(fos, "update thre new key value succesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 public  void displaydata(String key) {
	    	//convert the physical excel file into java understandable
	 		 try {
				fis = new FileInputStream(propertypath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	 		p=new Properties();
	 		try {
				p.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
	 		
	 		//fetch the data
	 		String data =p.getProperty(key);
	 		
	 		
	 		System.out.println(data);
	 }

}
