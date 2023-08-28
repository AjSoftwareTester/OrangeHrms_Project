package com.orangehrms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_Mouseover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  //Test Steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//mouseover
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouseover completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked on Submenu");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
