package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;
	
	@Given("I am on a Adactin page on Chrome Browser")
	public void i_am_on_a_Adactin_page_on_Chrome_Browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	}

	@When("I need to enter {string} and {string}")
	public void i_need_to_enter_and(String string, String string2) {
		 WebElement txtUser = driver.findElement(By.id("username"));
		    txtUser.sendKeys(string);
		    WebElement txtPass = driver.findElement(By.id("password"));
		    txtPass.sendKeys(string2);
	}
	
	@When("I need to click Login button")
	public void i_need_to_click_Login_button() {
	    WebElement login = driver.findElement(By.id("login"));
	    login.click();
	}

	@Then("I need to verify the Home page Screen appear or not")
	public void i_need_to_verify_the_Home_page_Screen_appear_or_not() {
	    System.out.println("Adactin page openss");
	}
	@When("I need to select {string} , {string} , {string} , {string}")
	public void i_need_to_select(String string, String string2, String string3, String string4) {
		WebElement location = driver.findElement(By.id("location"));
	    location.sendKeys(string);
	    
	    WebElement hotel = driver.findElement(By.id("hotels"));
	    hotel.sendKeys(string2);
	    
	    WebElement roomtype = driver.findElement(By.id("room_type"));
	    roomtype.sendKeys(string3);
	    
	    WebElement noofroom = driver.findElement(By.id("room_nos"));
	    noofroom.sendKeys(string4);
		
	}

	@When("Enter {string} and {string}")
	public void enter_and(String string, String string2) {
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','08/12/2021')", datein);
		 
	    WebElement dateout = driver.findElement(By.id("datepick_out"));
		 executor.executeScript("arguments[0].setAttribute('value','11/12/2021')", dateout);
	    
		
		
	}

	@Then("I need to select {string} and {string}")
	public void i_need_to_select_and(String string, String string2) {
	    
		WebElement adults = driver.findElement(By.id("adult_room"));
	    adults.sendKeys(string);
	    
	    WebElement childs = driver.findElement(By.id("child_room"));
	    childs.sendKeys(string2);
	}

	@Then("I need to click Search button")
	public void i_need_to_click_Search_button() {
	    
		WebElement btnsrch = driver.findElement(By.id("Submit"));
	    btnsrch.click();
	}

	@Then("I need to verify whether browser navigated to payment page")
	public void i_need_to_verify_whether_browser_navigated_to_payment_page() {
	    System.out.println("next page");
	}

	@When("I need to select the booking and click continue")
	public void i_need_to_select_the_booking_and_click_continue() {
	    
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
	    radiobutton.click();
	    WebElement cont = driver.findElement(By.id("continue"));
	    cont.click();
	}

	@Then("I need to check browser navigated to next page")
	public void i_need_to_check_browser_navigated_to_next_page() {
	   System.out.println("next page 1");
	}

	@When("I need to enter {string} , {string} , {string} and {string}")
	public void i_need_to_enter_and(String string, String string2, String string3, String string4) {
	    
		WebElement firstname = driver.findElement(By.id("first_name"));
		   firstname.sendKeys(string);
		   WebElement lastname = driver.findElement(By.id("last_name"));
		   lastname.sendKeys(string2);
		   WebElement address1 = driver.findElement(By.id("address"));
		   address1.sendKeys(string3);
		   WebElement ccno = driver.findElement(By.id("cc_num"));
		   ccno.sendKeys(string4);
	}

	@When("{string} , {string} and {string}")
	public void and(String string, String string2, String string3) {
	    
		WebElement cctype = driver.findElement(By.id("cc_type"));
		  cctype.sendKeys(string);
		   WebElement month = driver.findElement(By.id("cc_exp_month"));
		   month.sendKeys(string2);
		   WebElement year = driver.findElement(By.id("cc_exp_year"));
		   year.sendKeys(string3);
	}
	
	

	@Then("I need to enter {string} and click book now")
	public void i_need_to_enter_and_click_book_now(String string) {
	    
		 WebElement cvv = driver.findElement(By.id("cc_cvv"));
		    cvv.sendKeys(string);
		    WebElement booknow = driver.findElement(By.id("book_now"));
		    booknow.click();
	}

	@When("I need to click itenarary and navigte to next page")
	public void i_need_to_click_itenarary_and_navigte_to_next_page() throws InterruptedException {
	   
		Thread.sleep(6000);
		WebElement iiiii = driver.findElement(By.id("my_itinerary"));
	    iiiii.click();
	}

}
