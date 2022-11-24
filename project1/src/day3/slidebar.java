package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slidebar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://jqueryui.com/slider/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement s1=d.findElement(By.id("slider"));
		Actions act=new Actions(d);
		int y=s1.getLocation().y;//used when we dont know the slider location
		act.dragAndDropBy(s1, y, 500).build().perform();
		//y value by defaultly zero
		

	}

}
