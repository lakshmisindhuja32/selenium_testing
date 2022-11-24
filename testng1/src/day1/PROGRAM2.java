package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PROGRAM2 {
	WebDriver d;
	@BeforeMethod  
	public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void gettitle()
  {
	  System.out.println(d.getTitle());
  }
  @Test(priority=2)
  public void geturl()
  {
	  System.out.println(d.getCurrentUrl());
  }
  @Test(priority=3)
  public void Screenshot() throws IOException
  {
	  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("D://new10.png"));
  }
  @AfterMethod
  public void close()
  {
	  d.close();
  }
}
