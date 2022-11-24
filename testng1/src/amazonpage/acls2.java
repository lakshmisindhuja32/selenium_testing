package amazonpage;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class acls2 extends login{
  @Test(priority=2)
  public void geturl() 
  {
	  System.out.println(d.getCurrentUrl());
	  
  }
  @Test(priority=3)
  public void dropdown() 
  {
	  WebElement w=d.findElement(By.id("searchDropdownBox"));
	  List<WebElement> lw=w.findElements(By.tagName("option"));
	  System.out.println(lw.size());
	  for(int i=0;i<lw.size();i++)
	  {
		  System.out.println(lw.get(i).getText());
	  }
	  
  }
  @Test(priority=4)
  public void screenshot() throws IOException 
  {
	  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("D://new11.png"));
	  
  }
  
 
}
