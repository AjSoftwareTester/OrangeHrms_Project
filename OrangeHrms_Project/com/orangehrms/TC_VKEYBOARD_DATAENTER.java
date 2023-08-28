package com.orangehrms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VKEYBOARD_DATAENTER {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.close();
	}
}
