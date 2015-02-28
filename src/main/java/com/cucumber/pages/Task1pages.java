package com.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cucumber.framework.*;

public class Task1pages extends BasePage{

public void launchApplication()
{
	driver = new FirefoxDriver();
	driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
    driver.get("http://www.flipkart.com");
}



}
