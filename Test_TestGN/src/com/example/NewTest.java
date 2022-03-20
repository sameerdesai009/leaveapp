package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
	
  WebDriver driver; 
	
  @BeforeTest
  public void setup() { 
	  System.setProperty("webdriver.chrome.driver",
			  "G:\\Selenium zip\\chromedriver_win32\\chromedriver.exe"); 
	  driver = new ChromeDriver();
	  driver.get("https://acceptance.mgthost.com/login");
	  driver.manage().window().maximize(); 
  }
  
  @Test(priority=1)
  public void Login() throws InterruptedException {
	  Thread.sleep(5000);
	  WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement login = driver.findElement(By.xpath("//button[@class='button-action button-action__fat button-action--save']"));
	  email.sendKeys("demo+JC-01079@mercans.com");
	  password.sendKeys("Employee1!");
	  login.click();
	  Thread.sleep(20000);
	  WebElement login_success = driver.findElement(By.xpath("//span[@class='product-logo__subtitle']"));
	  Assert.assertEquals(true, login_success.isDisplayed());
	  System.out.println("Login successful");
  }
  
  @Test(priority=2)
  public void Notifications() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement notifications = driver.findElement(By.xpath("//div[contains(text(),' Notifications ')]"));
	  Assert.assertEquals(true, notifications.isDisplayed());
	  System.out.println("Notification module available");
  }
  
  @Test(priority=3)
  public void Quick_Access() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement quickaccess = driver.findElement(By.xpath("//div[contains(text(),' Quick access ')]"));
	  Assert.assertEquals(true, quickaccess.isDisplayed());
	  System.out.println("Quick Access module available");
  }
  
  @Test(priority=4)
  public void My_Information() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement myinformation = driver.findElement(By.xpath("//div[contains(text(),' My Information ')]"));
	  Assert.assertEquals(true, myinformation.isDisplayed());
	  System.out.println("My Information module available");
  }
  
  @Test(priority=5)
  public void Leaves() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement leaves = driver.findElement(By.xpath("//div[contains(text(),' Leaves ')]"));
	  Assert.assertEquals(true, leaves.isDisplayed());
	  System.out.println("Leaves module available");
  }

  @Test(priority=6)
  public void  Organizational_chart () throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement  organizationalchart  = driver.findElement(By.xpath("//div[contains(text(),' Organizational chart ')]"));
	  Assert.assertEquals(true, organizationalchart.isDisplayed());
	  System.out.println("Organizational chart module available");
  }
  
  
  @AfterTest
  public void Test() {
	  driver.close();		 
  }
  
 }
  
  

