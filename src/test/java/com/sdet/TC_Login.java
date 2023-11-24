package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {
	 @Test
		public void login_Test()
		{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver ();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

        driver.close();
	  

		
		}

}
