package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivernTest 
{
	@Given("I enter url {string}")
	public void i_enter_url(String string) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Url Entered");
	}

	@When("I enter email {string}")
	public void i_enter_email(String username) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(username);
		System.out.println("Username Entered");

	}

	@Then("I enter password {string}")
	public void i_enter_password(String passowrd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.findElement(By.id("pass")).sendKeys(passowrd);
        System.out.println("Password Entered");

	}





}
