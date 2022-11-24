package package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class creatingrelativexpath {

	public static void main(String[] args) throws IOException,InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@name='userName']")).sendKeys("mecury");
		

	}

}
