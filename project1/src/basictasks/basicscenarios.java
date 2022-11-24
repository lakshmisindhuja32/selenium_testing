package basictasks;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class basicscenarios {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.navigate().to("https://www.google.com");
			d.manage().window().maximize();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			d.close();
	}

}
