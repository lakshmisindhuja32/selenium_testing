package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newtoursexample2 {
	WebDriver d;
	@Given("user is in new tours page")
	public void user_is_in_new_tours_page() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe"); 
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		
	   
	}

	@When("user clicks on the register button")
	public void user_clicks_on_the_register_button() {
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	    
	}

	@Then("user select India from dropdown")
	public void user_select_india_from_dropdown() {
		d.findElement(By.name("country")).sendKeys("INDIA");
	   
	}

	@Then("user closes the window")
	public void user_closes_the_window() {
		System.out.println("Worked Properly");
		d.close();
	  
	}



}
