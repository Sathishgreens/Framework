package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	

	@Given("Launching FaceBook URL")
	public void launching_face_book_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	}
	@When("User Enters UserName and PassWorg")
	public void user_enters_user_name_and_pass_worg() {
		driver.findElement(By.id("email")).sendKeys("99999");
	    driver.findElement(By.id("pass")).sendKeys("12345");
	}
	@When("User Clicks Login")
	public void user_clicks_login() {
	    driver.findElement(By.name("login")).click();
	}
	@Then("Take Screenshot of result")
	public void take_screenshot_of_result() throws IOException {
		TakesScreenshot ts  = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	   File file = new File("C:\\Users\\Lenovo\\Documents\\Course Materials\\ss.png");
		
		FileUtils.copyFile(screenshotAs, file);
		
	}




}
