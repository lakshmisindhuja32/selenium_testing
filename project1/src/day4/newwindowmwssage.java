package day4;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindowmwssage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parent_id=d.getWindowHandle();
		System.out.println(parent_id);
		d.findElement(By.id("messageWindowButton")).click();
		Set<String> child_id=d.getWindowHandles();
		System.out.println(child_id);
		for(String handle:child_id)
		{
			if(!handle.equalsIgnoreCase(parent_id))
			{
				d.switchTo().window(handle);
				WebElement text=d.findElement(By.xpath("/html/body/text()"));
				System.out.println(text.getText());// we cannot capture the text as this is the static content
				d.close();
			}
		}
		
		

	}

}
