package com.orangehrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_Fileupload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
       driver.navigate().to("http://183.82.103.245/nareshit/login.php");
       //driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php&quot;);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("rightMenu");
        driver.findElement(By.xpath("//input[@value='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("last name");
        driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("first name");
         //To upload a file
WebElement fileInput = driver.findElement(By.
              xpath("//input[@type='file'][@name='photofile']"));                      
fileInput.sendKeys("C:\\Users\\good day\\Pictures\\aj.jpg");
        Thread.sleep(6000);
        System.out.println("File uploaded successfully");        
        driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
        Thread.sleep(6000);
          System.out.println("New Employee Added");
          driver.switchTo().defaultContent();
          driver.findElement(By.linkText("Logout")).click();
          driver.close();
	}

}
