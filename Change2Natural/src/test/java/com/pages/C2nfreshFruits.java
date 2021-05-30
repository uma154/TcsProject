package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C2nfreshFruits {
	
	WebDriver driver;
	
	By FFruits=By.partialLinkText("SHOP BY");
	
	By curryleaves=By.xpath("//*[@id=\"swap\"]/div/div/div[6]/div/article/div[1]/div[2]/a");
	By incrweight= By.xpath("//*[@id=\"add-Product-form\"]/div[2]/div/span/button[1]");
	
	By addcart=By.xpath("//*[@id=\"add-Product-form\"]/div[2]/button[1]");
	
	By cart=By.xpath("//*[@id=\"dropdownCartButton\"]/div[2]/span[1]");

	By chkout= By.xpath("//*[@id=\"stickyHeader\"]/div/div/div/div[3]/ul/li[4]/div/ul/li[3]/a[2]");
	By username = By.id("email");
	By password = By.id("password");
	By loginbutton = By.xpath("/html/body/section/div/div/div[1]/div[2]/form/div[3]/button");
	
		public  C2nfreshFruits(WebDriver driver) {
			this.driver=driver;
			
		}
			
	public void C2N_fruits() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(FFruits).click();
		Thread.sleep(4000);
		
	}
		
	public void C2N_pomeGrante() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(curryleaves).click();
	}

	public void C2N_weight() {
		driver.findElement(incrweight).click();
	}

	public void C2N_addtocart() {
		driver.findElement(addcart).click();
	}
	public void C2N_cart() {
		driver.findElement(cart).click();
	}

	public void C2N_checkout() {
		driver.findElement(chkout).click();
	}
	public void C2N_username(String email) {
		driver.findElement(username).sendKeys(email);
	}

	public void C2N_password(String pwd) {
		driver.findElement(username).sendKeys(pwd);
	}
	public void C2N_login() {
		driver.findElement(loginbutton).click();
	}
}
