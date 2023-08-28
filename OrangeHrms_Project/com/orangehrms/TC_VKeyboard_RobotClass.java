package com.orangehrms;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VKeyboard_RobotClass {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(4000);
	//Click -- Keyboard : TAB , ENTER
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(4000);
	System.out.println("TAB");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	System.out.println("Virtual_KEYBOARD_(ENTER)");
	System.out.println("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}