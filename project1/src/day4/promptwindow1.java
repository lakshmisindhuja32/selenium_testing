package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptwindow1 {
	WebDriver d;
	public void opening_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void title() {
		String a=d.getTitle();
		System.out.println(a);
	}
	public void url() {
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void prompt_window() throws InterruptedException
	{
		d.findElement(By.id("promtButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("welcome to selenium");
		Thread.sleep(2000);
		alt.accept();
		WebElement w=d.findElement(By.id("promptResult"));
		System.out.println(w.getText());
	}
	public void close()
	
	{
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		promptwindow1 p=new promptwindow1();
		p.opening_browser();
		p.title();
		p.url();
		p.prompt_window();
		p.close();
		

	}

}
