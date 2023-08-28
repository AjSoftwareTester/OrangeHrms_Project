package com.orangehrms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		List<WebElement> val = driver.findElements(By.tagName("a"));
		for(WebElement links:val) {
		System.out.println(links.getText());    
		}


		driver.close();
	}

}
