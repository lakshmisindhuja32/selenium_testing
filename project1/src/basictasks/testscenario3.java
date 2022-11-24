package basictasks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class testscenario3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		d.findElement(By.id("nav-search-submit-button")).click();
		boolean selected=d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(selected);
		boolean enabled=d.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(enabled);
		boolean displayed=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(displayed);

	}

}
