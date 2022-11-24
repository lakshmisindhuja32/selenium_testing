package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmations1 {
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
	}
	public void title() 
	{
		String a=d.getTitle();
		System.out.println(a);
	}
	public void url()
	{
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void confirmations_window() throws InterruptedException
	{
		d.findElement(By.id("confirmButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement text=d.findElement(By.id("confirmResult"));
		System.out.println(text.getText());
		
	}
	public void closed()
	{
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		confirmations1 c=new confirmations1();
		c.opening_browser();
		c.title();
		c.url();
		c.confirmations_window();
		c.closed();
	}

}
