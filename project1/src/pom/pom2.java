package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom2 {
	WebDriver d;
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	By phone=By.name("phone");
	By uname=By.name("userName");
	By cont=By.name("country");
	
	pom2(WebDriver d)
	{
		this.d=d;
	}
	public void fname()
	{
		d.findElement(fname).sendKeys("testing123");
		
	}
	public void lname()
	{
		d.findElement(lname).sendKeys("testing");
		
	}
	public void phonenum()
	{
		d.findElement(phone).sendKeys("1234567891");
		
	}
	public void email()
	{
		d.findElement(uname).sendKeys("lakshmi@gmail.com");
		
	}
	public void country()
	{
		d.findElement(cont).sendKeys("INDIA");
		
	}

}
