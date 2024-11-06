package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.CucumberHooks;

public class Tags 
{
	static Logger log = LogManager.getLogger("Tags");
	@Before("@sanity")
	public static void beforeHooks() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\danga\\eclipse-workspace\\CucmberConcepts\\target\\screenshot.png"));
		System.out.println("Run before sanity methods");
		log.info("Logging step working");
	}
	
	@When("Enter Sanity email")
	public void enter_sanity_email() {
	  System.out.println("Enter Sanity email");
	}

	@Then("Enter sanity password")
	public void enter_sanity_password() {
	    
	   System.out.println(" throw new io.cucumber.java.PendingException()");
	}


	@When("Enter smoke username")
	public void enter_smoke_username() {
	    System.out.println("Enter smoke username");
	}

	@Then("Enter smoke password")
	public void enter_smoke_password() {
	  System.out.println("Enter smoke password");
	}

	@When("Enter regression username")
	public void enter_regression_username() {
	    System.out.println("Enter regression username");
	}

	@Then("Enter regression password")
	public void enter_regression_password() {
	   System.out.println("Enter regression password");
	}
	

	@After("@regression")
	public static void AfterHooks()
	{
		System.out.println("Run before regression methods");
	}

}
