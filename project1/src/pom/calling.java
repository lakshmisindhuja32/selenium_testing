package pom;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/login.php";
		d.get(baseurl);
		d.manage().window().maximize();
		pom1 a1=new pom1(d);
		a1.uname();
		a1.pass();
		a1.signon();
		Thread.sleep(4000);
		d.close();
		

	}

}
