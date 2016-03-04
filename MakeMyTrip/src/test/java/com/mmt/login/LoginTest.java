package com.mmt.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	WebDriver driver;
	
	
  @Test
  public void test() throws Exception {
	  Thread.sleep(1000);
	  driver.get("http://www.spicejet.com/");
	  System.out.println(driver.getTitle());
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
