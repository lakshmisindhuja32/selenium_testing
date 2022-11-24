package day3;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String browser = sc.next();
		sc.close();
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("https://www.amazon.com/");
			d.manage().window().maximize();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			d.close();
			break;
		case "firefox":
			FirefoxDriver b = new FirefoxDriver();
			b.get("https://www.amazon.com/");
			b.manage().window().maximize();
			System.out.println(b.getTitle());
			System.out.println(b.getCurrentUrl());
			b.close();
			break;
		default:
			System.out.println("Invalid Browser");
		}

	}

}
