package com.Amazon.regestertest;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazonkart.generic.common.Baseclass;
import com.Amazonkart.generic.exelutility.ReadExcelFile;

public class RegesterTest extends Baseclass {

	@Test(enabled = false)
	public void createUser_validData() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verify Page Using Assert
		String exp_title = "LEarning WEB TECHNOLOGY FORMS";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title);

		// Create Object for RegisterPage
//			Registerpage regpage = new Registerpage(driver);
//			
//			// Step1:Clear the Name in The Name TextField
//			regpage.getName().clear();

		WebElement Name = driver.findElement(By.id("name"));
		Name.clear();

		WebElement Email = driver.findElement(By.id("email"));

		WebElement Password = driver.findElement(By.id("password"));

		WebElement Mobile = driver.findElement(By.id("mobile"));

		WebElement DOB = driver.findElement(By.id("dob"));

		// Create an Object for ExcelUtilityFile class
		ReadExcelFile excel_f = new ReadExcelFile();

		// Step 2: write the Name in the Name Text Field
		try {
			Name.sendKeys(excel_f.readdata("Sheet1", 1, 0));
			Email.sendKeys(excel_f.readdata("Sheet1", 1, 1));
			Password.sendKeys(excel_f.readdata("Sheet1", 1, 2));
//				Mobile.sendKeys(excel_f.readdata("Sheet1", 1, 0));
//				Name.sendKeys(excel_f.readdata("Sheet1", 1, 0));

		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}

		// Step3:Display the Email
		try {
			System.out.println(excel_f.readdata("Sheet1", 1, 2));
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}

		// Step4:Write the Data

		excel_f.writedata("Sheet1", 2, 1, "Anu21@gmail.com");

		// Execution Completed Message
		Reporter.log("createUser_validData for Register Test", true);
	}

	@Test(dataProvider = "Registerdata")
	public void createUser_invalidData(String name, String id, String dept) {

		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Dept:" + dept);
		Reporter.log("createUser_InvalidData for Register Test", true);

	}

}
