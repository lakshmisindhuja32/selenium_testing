package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class poly_login {
	WebDriver d;
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		d=new ChromeDriver();
	}
	public void login(String a) throws InterruptedException
	{
		d.get(a);
		d.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void login(String uname,String pass) throws InterruptedException
	{
		d.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(uname);
		d.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pass);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		poly_login pl=new poly_login();
		pl.login();
		pl.login("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		pl.login("Admin","admin123");
	}



}
