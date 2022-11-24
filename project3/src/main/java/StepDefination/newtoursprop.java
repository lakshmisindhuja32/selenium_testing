package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newtoursprop {
	WebDriver d;
	@Given("user is in newtours")
	public void user_is_in_newtours() {
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		    d=new ChromeDriver();
		    d.get("https://demo.guru99.com/test/newtours/login.php");
		    d.manage().window().maximize();
	    
	}

	@When("user needs to enter username and password")
	public void user_needs_to_enter_username_and_password() throws IOException {
		 FileInputStream f1=new FileInputStream("C:\\Users\\91779\\eclipse-workspace\\project3\\src\\main\\java\\StepDefination\\p1.properties");
		    Properties p1=new Properties();
		    p1.load(f1);
		    d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		    d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	       
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		  d.findElement(By.name("submit")).click();
		  Thread.sleep(2000);
	   
	    
	}

	@Then("user takes the screenshot and close the page")
	public void user_takes_the_screenshot_and_close_the_page() throws IOException {
		File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    Files.copy(f,new File("D://picture.png"));
	    d.close();
	   
	    
	}


}
