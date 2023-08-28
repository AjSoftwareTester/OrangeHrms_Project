package com.orangehrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.interactions.Actions;
public class TC_DragDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		//Verify title: stop exe in case of cond: failed
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		Thread.sleep(3000);
		System.out.println("Title matched");
		//Enter into frame
		driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),
		               driver.findElement(By.id("droppable"))).build().perform();
		System.out.println("Drag&Drop");
		Thread.sleep(3000);
		//exit from frame
		driver.switchTo().defaultContent();
		driver.close();
	}

}
