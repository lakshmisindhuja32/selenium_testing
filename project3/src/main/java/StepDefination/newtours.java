package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newtours 
{
	WebDriver d;
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		
	    
	}

	@When("user enters uname and password")
	public void user_enters_uname_and_password() {
		d.findElement(By.name("userName")).sendKeys("mercury");
		d.findElement(By.name("password")).sendKeys("mercury");
	    
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
		d.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	   
	}

	@Then("user back to home page")
	public void user_back_to_home_page() {
		d.navigate().back();
		d.close(); 
	}

}
