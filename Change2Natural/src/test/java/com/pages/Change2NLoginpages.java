package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Change2NLoginpages {

WebDriver driver;

	By loginlink=By.xpath("//*[@id=\"navbar_0_6\"]/div[2]/ul/li[3]/a");
	By username = By.id("email");
	By password = By.id("password");
	By loginbutton = By.xpath("/html/body/section/div/div/div[1]/div[2]/form/div[3]/button");
	
	
	public Change2NLoginpages (WebDriver driver) {
		this.driver = driver;
				
		}
	 public void loginToApp_loginlink() {
		driver.findElement(loginlink).click();
	 }
		public void loginToApp_username(String email) {
			driver.findElement(username).sendKeys(email);
		}
		public void loginToApp_password(String pass) {
			driver.findElement(password).sendKeys(pass);
		}
		public void loginToApp_loginbutton() {
			driver.findElement(loginbutton).click();
		}

}

