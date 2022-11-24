package pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		pom2 a2=new pom2(d);
		a2.fname();
		a2.lname();
		a2.phonenum();
		a2.email();
		a2.country();
		Thread.sleep(4000);
		d.close();
	}

}
