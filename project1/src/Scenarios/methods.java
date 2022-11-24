package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	static ChromeDriver d;
	public methods(ChromeDriver d)
	{
		this.d=d;
	}
	public void opening_browser()
	{
		System.setProperty("webdriver.chorme.driver","C:\\chromedriver.exe" );
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours");
		
		
		
	}
	public void navigate()
	{
		d.manage().window().maximize();
		
	}
	public void username_enter()
	{
		d.findElement(By.name("userName")).sendKeys("sindhu");
		
	}
	public void passwordenter()
	{
		d.findElement(By.name("password")).sendKeys("sindhu");
		
	}
	public void click()
	{
		d.findElement(By.name("submit")).click();
		
	}
	public void close()
	{
		d.close();
		
	}
	
}
