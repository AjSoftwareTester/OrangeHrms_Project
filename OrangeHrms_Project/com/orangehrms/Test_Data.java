package com.orangehrms;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//to access firefox browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//to access object Ind: methods
import org.openqa.selenium.By;
public class Test_Data {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestData
        //DT     Var          VV
static String      url = "http://183.82.103.245/nareshit/login.php";
static String username = "nareshit";
static String password = "nareshit";
static String title1   = "OrangeHRM - New Level of HR Management";
static String title2   = "OrangeHRM";
public static void main(String args[]) throws Exception{
    //Test Steps
WebDriver driver = new ChromeDriver();
driver.navigate().to(url);
Thread.sleep(3000);
System.out.println("Application Opened");
//Verify Application Title
//ActualResult      compare expected Result
if(driver.getTitle().equals(title1)) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
//TestData : HardCoded
//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
//TestData: Variable
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Login completed");
//Verify Title
if(driver.getTitle().equals(title2)) {
System.out.println("Title matched");    
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
