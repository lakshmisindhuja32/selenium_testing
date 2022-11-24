package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts1
{
	WebDriver d;
	public void oprning_browser()
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
	public void alert_message() throws InterruptedException
	{
		d.findElement(By.id("alertButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
		
	}
	public void close()
	{
		d.close();
	}
	public static void main(String args[]) throws InterruptedException {
		alerts1 a1=new alerts1();
		a1.oprning_browser();
		a1.title();
		a1.url();
		a1.alert_message();
		a1.close();
	}
}
