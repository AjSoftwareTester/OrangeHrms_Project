package com.orangehrms;
//package webdriverExamples;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//to access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//to access object Ind: methods
import org.openqa.selenium.By;
public class Verify_Title {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    //Test Steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		System.out.println("Application Opened");
		//Verify Application Title
		//ActualResult      compare expected Result
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title matched" +   driver.getTitle());    
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}

		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		//Verify Title
		if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title matched  "  +  driver.getTitle());    
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();


	}

}
