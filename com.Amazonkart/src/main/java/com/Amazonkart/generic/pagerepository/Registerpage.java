package com.Amazonkart.generic.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	public Registerpage(WebDriver driver) {
		
		  PageFactory.initElements(driver, this);
		}
		//1.Address of name textfeild
		@FindBy(id="name")
	   private WebElement nameTextfield1;
		
		public WebElement getName() {
			return nameTextfield1;	
		}
		
		//Address of name label
		@FindBy(xpath="//label[text()='Name:']")
		private  WebElement nameLabel;
		
		//2.Address of email textfeild
		@FindBy(id="email")
		private  WebElement emailTextfield;
		
		//Address of email label
		@FindBy(xpath="//label[text()='Email:']")
		private WebElement emaillabel1;
		
		//3.Address of password textfeild
		@FindBy(id="password")
		private WebElement pwdTextfield;
			
	    //Address of password label
		@FindBy(xpath="//label[text()='Password:']")
		private WebElement pwdlabel;
		
		//4.Address of mobile textfeild
		@FindBy(id="mobile")
		private WebElement mobTextfield;
				
		 //Address of email label
		@FindBy(xpath="//label[text()='Mobile.no:']")
		private WebElement moblabel;

}
