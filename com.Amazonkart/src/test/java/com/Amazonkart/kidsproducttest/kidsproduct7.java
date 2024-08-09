package com.Amazonkart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsproduct7 {
	@Test(groups ="ft")
	public void addproduct() {
		Reporter.log("addproduct-kids product successfully ",true);
	}
	
	@Test(groups ="it")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product successfully ",true);
	}
	
	@Test(groups ="sm")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product successfully ",true);
	}
}
