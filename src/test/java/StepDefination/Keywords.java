package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords 
{
	public static WebDriver driver;
	
	@Given("user login to facebook")
	public void user_login_to_facebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	
	@When("Enter username")
	public void enter_username() {
		driver.findElement(By.id("email")).sendKeys("username");
	}

	@Then("Enter password")
	public void enter_password() {
		
		driver.findElement(By.id("pass")).sendKeys("passowrd");
	}
	
	@Then("say hi")
	public void say_hi() {
		
		System.out.println("I quit");
		driver.quit();
	}




}
