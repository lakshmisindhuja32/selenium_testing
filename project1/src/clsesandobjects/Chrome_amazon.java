package clsesandobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_amazon {
	
	WebDriver d;
	
	public void open_chrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		d=new ChromeDriver();
		
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		
	}
	public void navigate_to_url() 
	{
		
		System.out.println(d.getCurrentUrl());
	}
	
	public void get_title()
	{
		
		System.out.println(d.getTitle());
		
	}
	public void drop()
	{
		
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i).getText());
			
		}
		
	}
	public void screenshot() throws IOException
	{
		
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("D://new.png"));
	}
	public void close()
	{
		
		d.close();
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Chrome_amazon p=new Chrome_amazon();
		p.open_chrome();
		p.navigate_to_url();
		p.get_title();
		p.drop();
		p.screenshot();
		p.close();
	}

}
