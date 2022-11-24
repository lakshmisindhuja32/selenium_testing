package basictasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcasescenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		d.findElement(By.id("nav-search-submit-button")).click();
		d.navigate().back();
		d.close();
		System.out.println("Thanks for visiting!!");

	}

}
