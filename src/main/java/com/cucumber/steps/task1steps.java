package com.cucumber.steps;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import com.cucumber.framework.DataSheet;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.model.CucumberTagStatement;

import com.cucumber.pages.*;
/*@Component
@ContextConfiguration("classpath:cucumber.xml")
*/
public class task1steps  {
	Task1pages obj = new Task1pages();
	
	
	DataSheet dataSheet=new DataSheet();
	@Given("^I launch the Website home page$")
	public void i_launch_the_Website_home_page() throws Throwable {
		obj.launchApplication();
	   	
	}
	
	/*@When("^I click on signup button and enter details and click on SignUp Now$")
	public void i_click_on_signup_button_and_enter_details_and_click_on_SignUp_Now() throws Throwable {
		dataSheet.fillSignupdata();  
				
		
		driver.findElement(By.xpath("//a[@class='signup-link']")).click();
	    driver.findElement(By.xpath("//*[@id='signup-email']")).sendKeys(dataSheet.email);
	    driver.findElement(By.xpath("//*[@id='signup-password']")).sendKeys(dataSheet.password);
	    driver.findElement(By.xpath("//*[@id='signup-repeat-password']")).sendKeys(dataSheet.repassword);
	    driver.findElement(By.xpath("//*[@value='Sign Up Now!']")).click();
	    
	    (new WebDriverWait(driver,30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='no-border'][contains(.,'Hi')]")));
		
	}

	
	
	@Then("^navigate to certain category to select an item$")
	public void navigate_to_certain_category_to_select_an_item() throws Throwable {
	
	(new WebDriverWait(driver,30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'Books & Media')]")));
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Books & Media')]"))).build().perform();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[@data-tracking-id='0_New Releases'][contains(.,'New Releases')])[1]")).click();
	List<WebElement> availble = driver.findElements(By.xpath("//input[@value='Add to Cart']"));
	availble.get(0).click();
	(new WebDriverWait(driver,60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='view-cart-form']/button")));
	driver.findElement(By.xpath("//*[@id='view-cart-form']/button")).click();
	(new WebDriverWait(driver,60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='Save & Continue']")));
		
	}
	@Then("^fill the billing details$")
	public void fill_the_billing_details() throws Throwable {
		dataSheet.fillBillingAddress();
		
		driver.findElement(By.id("name")).sendKeys("dsad");
		driver.findElement(By.id("pincode")).sendKeys(dataSheet.bilPincode);
		driver.findElement(By.id("address")).sendKeys(dataSheet.bilAddress);
		driver.findElement(By.id("phone")).sendKeys(dataSheet.bilPhone);
		driver.findElement(By.xpath("//*[@value='Save & Continue']")).click();
		
	}
	
	@When("^i proceed to the checkout$")
	public void i_proceed_to_the_checkout() throws Throwable {
		try{
			if(driver.findElement(By.xpath("(//a[contains(.,'Continue')])[2]")).isDisplayed())
			{
				System.out.println("Continue button is displayed");
			}
			}
			catch(Exception e){
				System.out.println("Continue button is not displayed");
			}
			driver.findElement(By.xpath("(//a[contains(.,'Continue')])[2]")).click();
	}
	
	
	@Then("^payment details page should be displayed$")
	public void paymet_details_page_should_be_displayed() throws Throwable {
		
			try{
			if(driver.findElement(By.id("card-form-sub")).isDisplayed())
			{
				System.out.println("Payment details are dispalyed");
			}
			}
			catch(Exception e){
				System.out.println("Payment details are not dispalyed");
			}
			
			driver.findElement(By.xpath("//span[contains(.,'Net Banking')]")).click();
			try{
				if(driver.findElement(By.xpath("//p[contains(.,'Popular banks')]")).isDisplayed())
				{
					System.out.println("bank details are displayed");
				}
				}
				catch(Exception e){
					System.out.println("bank details are not displayed");
				}
			
				}
	*/
	
	
	
	
	
	
}
