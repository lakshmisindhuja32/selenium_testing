package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions {
	
	
	
	public void details() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		
		d.findElement(By.name("userName")).sendKeys("selenium");
		d.findElement(By.name("password")).sendKeys("123");
		d.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		
	}
	public void details(String uname,String pas) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(pas);
		d.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		
	}
	public void details1(String uname,String pas) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(pas);
		d.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
	
	
		// TODO Auto-generated method stub
		
		functions f=new functions();
		f.details();
		f.details1("sindhu","password");	
		
		

	}

}
