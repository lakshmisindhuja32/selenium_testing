package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class google 
{
	WebDriver d;
	@Given("user is in google page")
	public void user_is_in_google_page() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		
	}

	@When("user searches some text")
	public void user_searches_some_text() {
		d.findElement(By.name("q")).sendKeys("Doremon");
		
		
	    
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement x=d.findElement(By.name("btnK"));
		x.click();
	    
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		System.out.println("happy");
	    d.close();
		
	}


}
