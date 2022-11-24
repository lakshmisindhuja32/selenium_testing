package day3;
//RIGHT CLICK OPERATION
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions1 {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/menu/");
		d.manage().window().maximize();
		//switch to frame from window
		d.switchTo().frame(0);
		WebElement music=d.findElement(By.id("ui-id-9"));
		music.click();
		Thread.sleep(2000);
		
		//jazz
		WebElement jazz=d.findElement(By.id("ui-id-13"));
		jazz.click();
		Thread.sleep(2000);
		
		//modern
		
		WebElement Modern=d.findElement(By.id("ui-id-16"));
		Modern.click();
		Thread.sleep(2000);
		
		Actions act =new Actions(d);
		act.moveToElement(music).moveToElement(jazz).moveToElement(Modern).build().perform();
		
		


	}

}
