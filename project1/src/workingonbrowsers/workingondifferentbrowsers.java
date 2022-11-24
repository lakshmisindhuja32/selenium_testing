package workingonbrowsers;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class workingondifferentbrowsers {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("firefox browser");

		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
		//working on chrome browser :

		System.out.println("chrome browser");

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d1=new ChromeDriver();
		d1.get("http://www.amazon.com");
		d1.manage().window().maximize();
		System.out.println(d1.getTitle());
		System.out.println(d1.getCurrentUrl());
		d1.close();

		System.out.println("InternetExplorer browser");

		System.setProperty("webdriver.ie.driver","C://IEDriverServer.exe");
		//ChromeDriver d1=new ChromeDriver();
		InternetExplorerDriver d2=new InternetExplorerDriver();
		
		d2.get("http://www.amazon.com");
		d2.manage().window().maximize();
		System.out.println(d2.getTitle());
		System.out.println(d2.getCurrentUrl());
		d2.close();

	}

}
