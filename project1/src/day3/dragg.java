package day3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragg {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement drag=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		Actions act=new Actions(d);
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
		d.close();
		
		
		

	}

}
