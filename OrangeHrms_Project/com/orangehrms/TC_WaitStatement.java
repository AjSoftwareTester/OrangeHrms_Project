package com.orangehrms;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TC_WaitStatement {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//Wait until login btn avalibale
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
	wait.until(ExpectedConditions.
	        elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	//Wait until empinfo: page has be ava:
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(4000);
	driver.close();
}
}