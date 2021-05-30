package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.reusableFunctions.SeleniumUtilities;

public class C2NSearchpage {
	
		WebDriver driver;

			By search=By.xpath("//*[@id=\"headerTen\"]/div[2]/div/div/div[2]/form/div/div[2]/input");
	
			By searchbutton=By.xpath("//*[@id=\"headerTen\"]/div[2]/div/div/div[2]/form/div/div[2]/button");
		
			By banana=By.xpath("//*[@id=\"swap\"]/div/div/div[2]/div/article/div[1]/div[2]/a");	
			
			By addcart=By.cssSelector("button[class='btn btn-secondary btn-lg swipe-to-top  add-to-Cart stock-cart']");
					
			
			//By incrcount=By.xpath("//*[@id=\"add-Product-form\"]/div[2]/div/span/button[1]");
			
			
			
			//By addcart=By.className("btn btn-secondary btn-lg swipe-to-top  add-to-Cart stock-cart");
			
			
			
			public  C2NSearchpage (WebDriver driver) {
				this.driver = driver;
						
				}
						
					public void searchApp_keyword(String banana) {
					driver.findElement(search).sendKeys(banana);
				}
		
				public void searchApp_searchbutton() {
					driver.findElement(searchbutton).click();
				}
				public void searchApp_item() throws InterruptedException {
					Thread.sleep(2000);
					driver.findElement(banana).click();
					Thread.sleep(3000);
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					
					jse.executeScript("window.scrollBy(0,250)");
					
				}
				
				public void searchApp_addtocart() throws InterruptedException {
					
					Thread.sleep(2000);
					driver.findElement(addcart).click();
					
				}

		}
