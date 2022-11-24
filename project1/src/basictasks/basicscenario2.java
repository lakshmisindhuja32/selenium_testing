package basictasks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicscenario2 {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		d.navigate().forward();
		d.navigate().back();
		d.close();
		
	}

}
