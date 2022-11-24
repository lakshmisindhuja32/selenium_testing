package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/nested-iframes-example/");
		d.manage().window().maximize();
		d.switchTo().frame("parent_iframe");
		d.findElement(By.id("u_5_5")).click();
		WebElement text=d.findElement(By.id("processing"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		WebElement text1=d.findElement(By.id("processing"));
		System.out.println(text1.getText());
		Thread.sleep(2000);
		
		
		d.close();
		

	}

}
